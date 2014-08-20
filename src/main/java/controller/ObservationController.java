package controller;

import dto.ObservationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.ObservationService;

import java.util.Date;
import java.util.List;

/**
 * Created by Dams on 6/08/2014.
 */
@RestController
public class ObservationController {

    @Autowired
    ObservationService observationService;

    @RequestMapping(value = "/observation", method = RequestMethod.POST)
    public ObservationDto create(@RequestParam(value="boarder", required = true) long idBoarder,
                                 @RequestParam(value="date", required = false) Long dateMill,
                             @RequestParam(value="comment", required = true) String comment)
    {
        Date date = new Date();
        if(dateMill != null) {
            date.setTime(dateMill);
        }
        return observationService.save(idBoarder, date, comment); }

    @RequestMapping(value = "/observation", method = RequestMethod.GET)
    public ObservationDto get(
            @RequestParam(value = "id", required = true) long id){
        return observationService.findById(id);
    }

    @RequestMapping(value = "/observation", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        observationService.delete(id);
    }

    @RequestMapping(value = "/observation", method = RequestMethod.PUT)
    public ObservationDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="boarder", required = false, defaultValue = "-1") long idBoarder,
            @RequestParam(value="date", required = false) Date date,
            @RequestParam(value="comment", required = false, defaultValue = "-1") String comment){

        return observationService.update(id, idBoarder, date, comment);
    }

    @RequestMapping(value = "/observation/all", method = RequestMethod.GET)
    public List<ObservationDto> getAll() {
        return observationService.findAll();
    }

}
