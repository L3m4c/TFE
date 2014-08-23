package controller;

import dto.ClothingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.ClothingService;

import java.util.Date;
import java.util.List;

/**
 * Created by Dams on 9/08/2014.
 */
@RestController
public class ClothingController {


    @Autowired
    ClothingService clothingService;

    @RequestMapping(value = "/clothing", method = RequestMethod.POST)
    public ClothingDto create(
            @RequestParam(value="boarder", required = true) long idBoarder,
            @RequestParam(value="date", required = false) Long dateMill,
            @RequestParam(value="clothingComplete", required = true) boolean clothingComplete,
            @RequestParam(value="clothingStimulated", required = true) boolean clothingStimulated)

    {
        Date date = new Date();
        if(dateMill != null) {
            date.setTime(dateMill);}

        return clothingService.save(idBoarder, date, clothingComplete, clothingStimulated); }

    @RequestMapping(value = "/clothing", method = RequestMethod.GET)
    public ClothingDto get(
            @RequestParam(value = "id", required = true) long id){
        return clothingService.findById(id);
    }

    @RequestMapping(value = "/clothing", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        clothingService.delete(id);
    }

    @RequestMapping(value = "/clothing", method = RequestMethod.PUT)
    public ClothingDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="boarder", required = false, defaultValue = "-1") long idBoarder,
            @RequestParam(value="date", required = false) Date date,
            @RequestParam(value="clothingComplete", required = false) boolean clothingComplete,
            @RequestParam(value="clothingStimulated", required = false) boolean clothingStimulated)

               {

        return clothingService.update(id,  idBoarder, date, clothingComplete, clothingStimulated);
    }

    @RequestMapping(value = "/clothing/all", method = RequestMethod.GET)
    public List<ClothingDto> getAll() {
        return clothingService.findAll();
    }

}
