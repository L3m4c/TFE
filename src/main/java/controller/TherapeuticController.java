package controller;

import dto.TherapeuticDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.TherapeuticService;

import java.util.Date;
import java.util.List;

/**
 * Created by Dams on 8/08/2014.
 */
@RestController
public class TherapeuticController {

    @Autowired
    TherapeuticService therapeuticService;

    @RequestMapping(value = "/therapeutic", method = RequestMethod.POST)
    public TherapeuticDto create(@RequestParam(value="boarder", required = true) long idBoarder,
                                 @RequestParam(value="date", required = false) Long dateMill,
            @RequestParam(value="preparation", required = true) boolean preparation,
            @RequestParam(value="adMorning", required = true) boolean adMorning,
            @RequestParam(value="adMidday", required = true) boolean adMidday,
            @RequestParam(value="adEvening", required = true) boolean adEvening,
            @RequestParam(value="adNight", required = true) boolean adNight)
    {
        Date date = new Date();
        if(dateMill != null) {
            date.setTime(dateMill);}
        return therapeuticService.save(idBoarder, date, preparation, adMorning, adMidday, adEvening, adNight); }

    @RequestMapping(value = "/therapeutic", method = RequestMethod.GET)
    public TherapeuticDto get(
            @RequestParam(value = "id", required = true) long id){
        return therapeuticService.findById(id);
    }

    @RequestMapping(value = "/therapeutic", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        therapeuticService.delete(id);
    }

    @RequestMapping(value = "/therapeutic", method = RequestMethod.PUT)
    public TherapeuticDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="boarder", required = false) long idBoarder,
            @RequestParam(value="date", required = false) long date,
            @RequestParam(value="preparation", required = false) boolean preparation,
            @RequestParam(value="adMorning", required = false) boolean adMorning,
            @RequestParam(value="adMidday", required = false) boolean adMidday,
            @RequestParam(value="adEvening", required = false) boolean adEvening,
            @RequestParam(value="adNight", required = false) boolean adNight)
    {
        Date dateFormat = new Date();
        dateFormat.setTime(date);
        return therapeuticService.update(id, idBoarder, dateFormat, preparation, adMorning, adMidday, adEvening, adNight);
    }

    @RequestMapping(value = "/therapeutic/all", method = RequestMethod.GET)
    public List<TherapeuticDto> getAll() {
        return therapeuticService.findAll();
    }

}
