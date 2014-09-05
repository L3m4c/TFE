package controller;

import dto.InsulinTakingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.InsulinTakingService;

import java.util.Date;
import java.util.List;

/**
 * Created by Dams on 6/08/2014.
 */
@RestController
public class InsulinTakingController {

    @Autowired
    InsulinTakingService insulinTakingService;

    @RequestMapping(value = "/insulinTaking", method = RequestMethod.POST)
    public InsulinTakingDto create(@RequestParam(value="boarder", required = true) long idBoarder,
                                   @RequestParam(value="date", required = false) Long dateMill,

                                   @RequestParam(value="glycemia", required = true) int glycemia)
    {
        Date date = new Date();
        if(dateMill != null) {
            date.setTime(dateMill);
        }
        return insulinTakingService.save(idBoarder, date, glycemia); }


    @RequestMapping(value = "/insulinTaking", method = RequestMethod.GET)
    public InsulinTakingDto get(
            @RequestParam(value = "id", required = true) long id){
        return insulinTakingService.findById(id);
    }

    @RequestMapping(value = "/insulinTaking", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        insulinTakingService.delete(id);
    }

    @RequestMapping(value = "/insulinTaking", method = RequestMethod.PUT)
    public InsulinTakingDto update(
            @RequestParam(value = "id", required = true) long id,
        @RequestParam(value="boarder", required = false) long idBoarder,
        @RequestParam(value="date", required = false) long date,
        @RequestParam(value="glycemia", required = false) int glycemia){

        Date dateFormat = new Date();
        dateFormat.setTime(date);
        return insulinTakingService.update(id, idBoarder, dateFormat, glycemia);
    }

    @RequestMapping(value = "/insulinTaking/all", method = RequestMethod.GET)
    public List<InsulinTakingDto> getAll() {
        return insulinTakingService.findAll();
    }
}
