package controller;

import dto.ParameterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.ParameterService;

import java.util.Date;
import java.util.List;

/**
 * Created by Dams on 9/08/2014.
 */
@RestController
public class ParameterController {

    @Autowired
    ParameterService parameterService;

    @RequestMapping(value = "/parameter", method = RequestMethod.POST)
    public ParameterDto create(
                             @RequestParam(value="boarder", required = true) long idBoarder,
                             @RequestParam(value="date", required = false) Long dateMill,
                             @RequestParam(value="pulse", required = true) int pulse,
                             @RequestParam(value="tension", required = true) int tension,
                             @RequestParam(value="temperature", required = true) int temperature)
    {
        Date date = new Date();
        if(dateMill != null) {
            date.setTime(dateMill);}

        return parameterService.save(idBoarder, date, pulse, tension, temperature); }

    @RequestMapping(value = "/parameter", method = RequestMethod.GET)
    public ParameterDto get(
            @RequestParam(value = "id", required = true) long id){
        return parameterService.findById(id);
    }

    @RequestMapping(value = "/parameter", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        parameterService.delete(id);
    }

    @RequestMapping(value = "/parameter", method = RequestMethod.PUT)
    public ParameterDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="boarder", required = false, defaultValue = "-1") long idBoarder,
            @RequestParam(value="date", required = false) Date date,
            @RequestParam(value="pulse", required = false, defaultValue = "-1") int pulse,
            @RequestParam(value="tension", required = false, defaultValue = "-1") int tension,
            @RequestParam(value="temperature", required = false, defaultValue = "-1") int temperature){

        return parameterService.update(id, idBoarder, date, pulse, tension, temperature);
    }

    @RequestMapping(value = "/parameter/all", method = RequestMethod.GET)
    public List<ParameterDto> getAll() {
        return parameterService.findAll();
    }

}
