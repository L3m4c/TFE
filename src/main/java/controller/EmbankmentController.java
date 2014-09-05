package controller;

import dto.EmbankmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.EmbankmentService;

import java.util.Date;
import java.util.List;

/**
 * Created by Dams on 12/08/2014.
 */
@RestController
public class EmbankmentController {


    @Autowired
    EmbankmentService embankmentService;

    @RequestMapping(value = "/embankment", method = RequestMethod.POST)
    public EmbankmentDto create(
            @RequestParam(value="boarder", required = true) long idBoarder,
            @RequestParam(value="date", required = false) Long dateMill,
            @RequestParam(value="regular", required = true) boolean regular,
            @RequestParam(value="irregular", required = true) boolean irregular,
            @RequestParam(value="furrow", required = true) boolean furrow,
            @RequestParam(value="detachment", required = true) boolean detachment,
            @RequestParam(value="budding", required = true) boolean budding)

    {
        Date date = new Date();
        if(dateMill != null) {
            date.setTime(dateMill);}

        return embankmentService.save(idBoarder, date, regular, irregular, furrow, detachment, budding); }

    @RequestMapping(value = "/embankment", method = RequestMethod.GET)
    public EmbankmentDto get(
            @RequestParam(value = "id", required = true) long id){
        return embankmentService.findById(id);
    }

    @RequestMapping(value = "/embankment", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        embankmentService.delete(id);
    }

    @RequestMapping(value = "/embankment", method = RequestMethod.PUT)
    public EmbankmentDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="boarder", required = false, defaultValue = "-1") long idBoarder,
            @RequestParam(value="date", required = false) Date date,
            @RequestParam(value="regular", required = true) boolean regular,
            @RequestParam(value="irregular", required = true) boolean irregular,
            @RequestParam(value="furrow", required = true) boolean furrow,
            @RequestParam(value="detachment", required = true) boolean detachment,
            @RequestParam(value="budding", required = true) boolean budding)

    {

        return embankmentService.update(id, idBoarder, date, regular, irregular, furrow, detachment, budding);
    }

    @RequestMapping(value = "/embankment/all", method = RequestMethod.GET)
    public List<EmbankmentDto> getAll() {
        return embankmentService.findAll();
    }



}
