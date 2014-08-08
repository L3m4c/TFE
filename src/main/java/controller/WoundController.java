package controller;

import dto.WoundDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.WoundService;

import java.util.List;

/**
 * Created by Dams on 7/08/2014.
 */
@RestController
public class WoundController {

    @Autowired
    WoundService woundService;

    @RequestMapping(value = "/wound", method = RequestMethod.POST)
    public WoundDto create(
            @RequestParam(value="localisation", required = true) String localisation,
            @RequestParam(value="type", required = true) String type,
            @RequestParam(value="description", required = true) String description)
    {
        return woundService.save(localisation, type, description); }

    @RequestMapping(value = "/wound", method = RequestMethod.GET)
    public WoundDto get(
            @RequestParam(value = "id", required = true) long id){
        return woundService.findById(id);
    }

    @RequestMapping(value = "/wound", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        woundService.delete(id);
    }

    @RequestMapping(value = "/wound", method = RequestMethod.PUT)
    public WoundDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="localisation", required = false, defaultValue = "-1") String localisation,
            @RequestParam(value="type", required = false, defaultValue = "-1") String type,
            @RequestParam(value="description", required = false, defaultValue = "-1") String description){

        return woundService.update(id, localisation, type, description);
    }

    @RequestMapping(value = "/wound/all", method = RequestMethod.GET)
    public List<WoundDto> getAll() {
        return woundService.findAll();
    }



}
