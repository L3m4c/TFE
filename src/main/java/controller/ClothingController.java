package controller;

import dto.ClothingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.ClothingService;

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
            @RequestParam(value="clothingComplete", required = true) boolean clothingComplete,
            @RequestParam(value="stimulated", required = true) boolean stimulated)

    {
        return clothingService.save(clothingComplete, stimulated); }

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
            @RequestParam(value="clothingComplete", required = false) boolean clothingComplete,
            @RequestParam(value="stimulated", required = false) boolean stimulated)

               {

        return clothingService.update(id, clothingComplete, stimulated);
    }

    @RequestMapping(value = "/clothing/all", method = RequestMethod.GET)
    public List<ClothingDto> getAll() {
        return clothingService.findAll();
    }

}
