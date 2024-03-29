package controller;

import dto.IncontinenceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.IncontinenceService;

import java.util.Date;
import java.util.List;

/**
 * Created by Dams on 9/08/2014.
 */
@RestController
public class IncontinenceController {

    @Autowired
    IncontinenceService incontinenceService;

    @RequestMapping(value = "/incontinence", method = RequestMethod.POST)
    public IncontinenceDto create(
            @RequestParam(value="boarder", required = true) long idBoarder,
            @RequestParam(value="date", required = false) Long dateMill,
            @RequestParam(value="diurnal", required = true) boolean diurnal,
            @RequestParam(value="nocturnal", required = true) boolean nocturnal,
            @RequestParam(value="both", required = true) boolean both)

    {Date date = new Date();
        if(dateMill != null) {
            date.setTime(dateMill);}

        return incontinenceService.save(idBoarder, date, diurnal, nocturnal, both); }

    @RequestMapping(value = "/incontinence", method = RequestMethod.GET)
    public IncontinenceDto get(
            @RequestParam(value = "id", required = true) long id){
        return incontinenceService.findById(id);
    }

    @RequestMapping(value = "/incontinence", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        incontinenceService.delete(id);
    }

    @RequestMapping(value = "/incontinence", method = RequestMethod.PUT)
    public IncontinenceDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="boarder", required = false, defaultValue = "-1") long idBoarder,
            @RequestParam(value="date", required = false) Date date,
            @RequestParam(value="diurnal", required = false) boolean diurnal,
            @RequestParam(value="nocturnal", required = false) boolean nocturnal,
            @RequestParam(value="both", required = false) boolean both)

    {

        return incontinenceService.update(id, idBoarder, date, diurnal, nocturnal, both);
    }

    @RequestMapping(value = "/incontinence/all", method = RequestMethod.GET)
    public List<IncontinenceDto> getAll() {
        return incontinenceService.findAll();
    }


}
