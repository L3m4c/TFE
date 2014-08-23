package controller;

import dto.EatDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.EatService;

import java.util.Date;
import java.util.List;

/**
 * Created by Dams on 9/08/2014.
 */
@RestController
public class EatController {

    @Autowired
    EatService eatService;

    @RequestMapping(value = "/eat", method = RequestMethod.POST)
    public EatDto create(
            @RequestParam(value="boarder", required = true) long idBoarder,
            @RequestParam(value="date", required = false) Long dateMill,
            @RequestParam(value="priorAid", required = true) boolean priorAid,
            @RequestParam(value="fullAid", required = true) boolean fullAid,
            @RequestParam(value="eatStimulated", required = true) boolean eatStimulated,
            @RequestParam(value="hydration", required = true) boolean hydration)

    {
        Date date = new Date();
        if(dateMill != null) {
            date.setTime(dateMill);}

        return eatService.save(idBoarder, date, priorAid, fullAid, eatStimulated, hydration); }

    @RequestMapping(value = "/eat", method = RequestMethod.GET)
    public EatDto get(
            @RequestParam(value = "id", required = true) long id){
        return eatService.findById(id);
    }

    @RequestMapping(value = "/eat", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        eatService.delete(id);
    }

    @RequestMapping(value = "/eat", method = RequestMethod.PUT)
    public EatDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="boarder", required = false, defaultValue = "-1") long idBoarder,
            @RequestParam(value="date", required = false) Date date,
            @RequestParam(value="priorAid", required = false) boolean priorAid,
            @RequestParam(value="fullAid", required = false) boolean fullAid,
            @RequestParam(value="eatStimulated", required = false) boolean eatStimulated,
            @RequestParam(value="hydration", required = false) boolean hydration)

    {

        return eatService.update(id, idBoarder, date, priorAid, fullAid, eatStimulated, hydration);
    }

    @RequestMapping(value = "/eat/all", method = RequestMethod.GET)
    public List<EatDto> getAll() {
        return eatService.findAll();
    }


}
