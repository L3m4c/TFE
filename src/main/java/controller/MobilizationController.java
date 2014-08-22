package controller;

import dto.MobilizationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.MobilizationService;

import java.util.Date;
import java.util.List;

/**
 * Created by Dams on 9/08/2014.
 */
@RestController
public class MobilizationController {

    @Autowired
    MobilizationService mobilizationService;

    @RequestMapping(value = "/mobilization", method = RequestMethod.POST)
    public MobilizationDto create(
            @RequestParam(value="boarder", required = true) long idBoarder,
            @RequestParam(value="date", required = false) Long dateMill,
            @RequestParam(value="help", required = true) boolean help,
            @RequestParam(value="material", required = true) boolean material,
            @RequestParam(value="cane", required = true) boolean cane)

    { Date date = new Date();
        if(dateMill != null) {
            date.setTime(dateMill);}

        return mobilizationService.save(idBoarder, date, help, material, cane); }

    @RequestMapping(value = "/mobilization", method = RequestMethod.GET)
    public MobilizationDto get(
            @RequestParam(value = "id", required = true) long id){
        return mobilizationService.findById(id);
    }

    @RequestMapping(value = "/mobilization", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        mobilizationService.delete(id);
    }

    @RequestMapping(value = "/mobilization", method = RequestMethod.PUT)
    public MobilizationDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="boarder", required = false, defaultValue = "-1") long idBoarder,
            @RequestParam(value="date", required = false) Date date,
            @RequestParam(value="help", required = false) boolean help,
            @RequestParam(value="material", required = false) boolean material,
            @RequestParam(value="cane", required = false) boolean cane)

    {

        return mobilizationService.update(id, idBoarder, date, help, material, cane);
    }

    @RequestMapping(value = "/mobilization/all", method = RequestMethod.GET)
    public List<MobilizationDto> getAll() {
        return mobilizationService.findAll();
    }

}
