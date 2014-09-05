package controller;

import dto.BandageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.BandageService;

import java.util.Date;
import java.util.List;

/**
 * Created by Dams on 12/08/2014.
 */

@RestController
public class BandageController {


    @Autowired
    BandageService bandageService;

    @RequestMapping(value = "/bandage", method = RequestMethod.POST)
    public BandageDto create(
            @RequestParam(value="boarder", required = true) long idBoarder,
            @RequestParam(value="date", required = false) Long dateMill,
            @RequestParam(value="product", required = true) String product,
            @RequestParam(value="bandageCovering", required = true) String bandageCovering,
            @RequestParam(value="comment", required = true) String comment)
    {
        Date date = new Date();
        if(dateMill != null) {
            date.setTime(dateMill);}

        return bandageService.save(idBoarder, date, product, bandageCovering, comment); }

    @RequestMapping(value = "/bandage", method = RequestMethod.GET)
    public BandageDto get(
            @RequestParam(value = "id", required = true) long id){
        return bandageService.findById(id);
    }

    @RequestMapping(value = "/bandage", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        bandageService.delete(id);
    }

    @RequestMapping(value = "/bandage", method = RequestMethod.PUT)
    public BandageDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="boarder", required = false, defaultValue = "-1") long idBoarder,
            @RequestParam(value="date", required = false) Date date,
            @RequestParam(value="product", required = true) String product,
            @RequestParam(value="bandageCovering", required = true) String bandageCovering,
            @RequestParam(value="comment", required = true) String comment){

        return bandageService.update(id, idBoarder, date, product, bandageCovering, comment);
    }

    @RequestMapping(value = "/bandage/all", method = RequestMethod.GET)
    public List<BandageDto> getAll() {
        return bandageService.findAll();
    }



}
