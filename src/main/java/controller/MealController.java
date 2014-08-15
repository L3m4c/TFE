package controller;

import dto.MealDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.MealService;

import java.util.Date;
import java.util.List;

/**
 * Created by Sl0th on 27/06/2014.
 */
@RestController
public class MealController {

    @Autowired
    MealService mealService;

    @RequestMapping(value = "/meal", method = RequestMethod.POST)
    public MealDto create(@RequestParam(value="boarder", required = true) long idBoarder,
                          @RequestParam(value="date", required = false) Long dateMill){
        Date date = new Date();
        if(dateMill != null) {
            date.setTime(dateMill);
        }
        return mealService.save(idBoarder, date);
    }

    @RequestMapping(value = "/meal", method = RequestMethod.GET)
    public MealDto get(
            @RequestParam(value = "id", required = true) long id){
        return mealService.findById(id);
    }

    @RequestMapping(value = "/meal", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        mealService.delete(id);
    }

    @RequestMapping(value = "/meal", method = RequestMethod.PUT)
    public MealDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="boarder", required = false, defaultValue = "-1") long idBoarder,
            @RequestParam(value="date", required = false) Date date){

        return mealService.update(id, idBoarder, date);
    }

    @RequestMapping(value = "/meal/all", method = RequestMethod.GET)
    public List<MealDto> getAll() {
        return mealService.findAll();
    }
}
