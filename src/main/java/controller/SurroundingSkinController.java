package controller;

import dto.SurroundingSkinDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.SurroundingSkinService;

import java.util.Date;
import java.util.List;

/**
 * Created by Dams on 12/08/2014.
 */
@RestController
public class SurroundingSkinController {

    @Autowired
    SurroundingSkinService surroundingSkinService;

    @RequestMapping(value = "/surroundingSkin", method = RequestMethod.POST)
    public SurroundingSkinDto create(
            @RequestParam(value="boarder", required = true) long idBoarder,
            @RequestParam(value="date", required = false) Long dateMill,
            @RequestParam(value="healthy", required = true) boolean healthy,
            @RequestParam(value="fragile", required = true) boolean fragile,
            @RequestParam(value="dry", required = true) boolean dry,
            @RequestParam(value="hyperpigmented", required = true) boolean hyperpigmented,
            @RequestParam(value="hyperkeration", required = true) boolean hyperkeration,
            @RequestParam(value="inflammatory", required = true) boolean inflammatory,
            @RequestParam(value="macerated", required = true) boolean macerated,
            @RequestParam(value="ulcerated", required = true) boolean ulcerated)

    {Date date = new Date();
        if(dateMill != null) {
            date.setTime(dateMill);}

        return surroundingSkinService.save(idBoarder, date, healthy, fragile, dry, hyperpigmented, hyperkeration, inflammatory, macerated, ulcerated); }

    @RequestMapping(value = "/surroundingSkin", method = RequestMethod.GET)
    public SurroundingSkinDto get(
            @RequestParam(value = "id", required = true) long id){
        return surroundingSkinService.findById(id);
    }

    @RequestMapping(value = "/surroundingSkin", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        surroundingSkinService.delete(id);
    }

    @RequestMapping(value = "/surroundingSkin", method = RequestMethod.PUT)
    public SurroundingSkinDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="boarder", required = false, defaultValue = "-1") long idBoarder,
            @RequestParam(value="date", required = false) Date date,
            @RequestParam(value="healthy", required = true) boolean healthy,
            @RequestParam(value="fragile", required = true) boolean fragile,
            @RequestParam(value="dry", required = true) boolean dry,
            @RequestParam(value="hyperpigmented", required = true) boolean hyperpigmented,
            @RequestParam(value="hyperkeration", required = true) boolean hyperkeration,
            @RequestParam(value="inflammatory", required = true) boolean inflammatory,
            @RequestParam(value="macerated", required = true) boolean macerated,
            @RequestParam(value="ulcerated", required = true) boolean ulcerated)

    {

        return surroundingSkinService.update(id, idBoarder, date, healthy, fragile, dry, hyperpigmented, hyperkeration, inflammatory, macerated, ulcerated);
    }

    @RequestMapping(value = "/surroundingSkin/all", method = RequestMethod.GET)
    public List<SurroundingSkinDto> getAll() {
        return surroundingSkinService.findAll();
    }




}
