package controller;

import dto.InsulinDosageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.InsulinDosageService;

import java.util.Date;
import java.util.List;

/**
 * Created by Dams on 6/08/2014.
 */
@RestController
public class InsulinDosageController {


    @Autowired
    InsulinDosageService insulinDosageService;

    @RequestMapping(value = "/insulinDosage", method = RequestMethod.POST)
    public InsulinDosageDto create(@RequestParam(value="boarder", required = true) long idBoarder,
                                   @RequestParam(value="date", required = false) Long dateMill,

                                   @RequestParam(value="dosage", required = true) int dosage)
    {
        Date date = new Date();
        if(dateMill != null) {
            date.setTime(dateMill);
        }
        return insulinDosageService.save(idBoarder, date, dosage); }


    @RequestMapping(value = "/insulinDosage", method = RequestMethod.GET)
    public InsulinDosageDto get(
            @RequestParam(value = "id", required = true) long id){
        return insulinDosageService.findById(id);
    }

    @RequestMapping(value = "/insulinDosage", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        insulinDosageService.delete(id);
    }

    @RequestMapping(value = "/insulinDosage", method = RequestMethod.PUT)
    public InsulinDosageDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="boarder", required = false, defaultValue = "-1") long idBoarder,
            @RequestParam(value="date", required = false) long date,
            @RequestParam(value="dosage", required = false) int dosage){

        Date dateFormat = new Date();
        dateFormat.setTime(date);
        return insulinDosageService.update(id, idBoarder, dateFormat, dosage);
    }

    @RequestMapping(value = "/insulinDosage/all", method = RequestMethod.GET)
    public List<InsulinDosageDto> getAll() {
        return insulinDosageService.findAll();
    }
}
