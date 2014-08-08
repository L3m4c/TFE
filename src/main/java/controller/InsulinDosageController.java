package controller;

import dto.InsulinDosageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.InsulinDosageService;

import java.util.List;

/**
 * Created by Dams on 6/08/2014.
 */
@RestController
public class InsulinDosageController {


    @Autowired
    InsulinDosageService insulinDosageService;

    @RequestMapping(value = "/insulinDosage", method = RequestMethod.POST)
    public InsulinDosageDto create(@RequestParam(value="morning", required = true) int morning,
                                   @RequestParam(value="midday", required = true) int midday,
                                   @RequestParam(value="evening", required = true) int evening,
                                   @RequestParam(value="night", required = true) int night)
    {
        return insulinDosageService.save(morning, midday, evening, night); }


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
            @RequestParam(value="morning", required = false) int morning,
            @RequestParam(value="midday", required = false) int midday,
            @RequestParam(value="evening", required = false) int evening,
            @RequestParam(value="night", required = false) int night){

        return insulinDosageService.update(id, morning, midday, evening, night);
    }

    @RequestMapping(value = "/insulinDosage/all", method = RequestMethod.GET)
    public List<InsulinDosageDto> getAll() {
        return insulinDosageService.findAll();
    }
}
