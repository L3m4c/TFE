package controller;

import dto.DrugDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.DrugService;

import java.util.List;

/**
 * Created by Dams on 13/08/2014.
 */
@RestController
public class DrugController {

    @Autowired
    DrugService drugService;

    @RequestMapping(value = "/drug", method = RequestMethod.POST)
    public DrugDto create(   @RequestParam(value="name", required = true) String name,
                             @RequestParam(value="dosage", required = true) int dosage,
                             @RequestParam(value="unit", required = true) String unit)
    {
        return drugService.save(name, dosage, unit); }

    @RequestMapping(value = "/drug", method = RequestMethod.GET)
    public DrugDto get(
            @RequestParam(value = "id", required = true) long id){
        return drugService.findById(id);
    }

    @RequestMapping(value = "/Drug", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        drugService.delete(id);
    }

    @RequestMapping(value = "/drug", method = RequestMethod.PUT)
    public DrugDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="name", required = false, defaultValue = "-1") String name,
            @RequestParam(value="dosage", required = false, defaultValue = "-1") int dosage,
            @RequestParam(value="unit", required = false, defaultValue = "-1") String unit){

        return drugService.update(id, name, dosage, unit);
    }

    @RequestMapping(value = "/drug/all", method = RequestMethod.GET)
    public List<DrugDto> getAll() {
        return drugService.findAll();
    }


}
