package controller;

import dto.InsulinTakingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.InsulinTakingService;

import java.util.List;

/**
 * Created by Dams on 6/08/2014.
 */
@RestController
public class InsulinTakingController {

    @Autowired
    InsulinTakingService insulinTakingService;

    @RequestMapping(value = "/insulinTaking", method = RequestMethod.POST)
    public InsulinTakingDto create(@RequestParam(value="morning", required = true) int morning,
                               @RequestParam(value="midday", required = true) int midday,
                               @RequestParam(value="evening", required = true) int evening)
    {
        return insulinTakingService.save(morning, midday, evening); }


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
            @RequestParam(value="morning", required = false) int morning,
            @RequestParam(value="midday", required = false) int midday,
            @RequestParam(value="evening", required = false) int evening){

        return insulinTakingService.update(id, morning, midday, evening);
    }

    @RequestMapping(value = "/insulinTaking/all", method = RequestMethod.GET)
    public List<InsulinTakingDto> getAll() {
        return insulinTakingService.findAll();
    }
}
