package controller;

import dto.ObservationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.ObservationService;

import java.util.List;

/**
 * Created by Dams on 6/08/2014.
 */
@RestController
public class ObservationController {

    @Autowired
    ObservationService observationService;

    @RequestMapping(value = "/observation", method = RequestMethod.POST)
    public ObservationDto create(
                             @RequestParam(value="comment", required = true) String comment)
    {
        return observationService.save(comment); }

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
            @RequestParam(value="comment", required = false, defaultValue = "-1") String comment){

        return observationService.update(id, comment);
    }

    @RequestMapping(value = "/observation/all", method = RequestMethod.GET)
    public List<ObservationDto> getAll() {
        return observationService.findAll();
    }

}