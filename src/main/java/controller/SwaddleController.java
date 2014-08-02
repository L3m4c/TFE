package controller;


import dto.SwaddleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.SwaddleService;

import java.util.Date;
import java.util.List;

/**
 * Created by Dams on 2/07/2014.
 */
@RestController
public class SwaddleController {

    @Autowired
    SwaddleService swaddleService;

    @RequestMapping(value = "/swaddle", method = RequestMethod.POST)
    public SwaddleDto create(@RequestParam(value="boarder", required = true) long idBoarder,
                          @RequestParam(value="user", required = true) long idUser,
                          @RequestParam(value="date", required = false) Date date){
        return swaddleService.save(idBoarder, idUser, date); }

    @RequestMapping(value = "/swaddle", method = RequestMethod.GET)
    public SwaddleDto get(
            @RequestParam(value = "id", required = true) long id){
        return swaddleService.findById(id);
    }

    @RequestMapping(value = "/swaddle", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        swaddleService.delete(id);
    }

    @RequestMapping(value = "/swaddle", method = RequestMethod.PUT)
    public SwaddleDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="boarder", required = false, defaultValue = "-1") long idBoarder,
            @RequestParam(value="user", required = false, defaultValue = "-1") long idUser,
            @RequestParam(value="date", required = false) Date date){

        return swaddleService.update(id, idBoarder, idUser, date);
    }

    @RequestMapping(value = "/swaddle/all", method = RequestMethod.GET)
    public List<SwaddleDto> getAll() {
        return swaddleService.findAll();
    }

}
