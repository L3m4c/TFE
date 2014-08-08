package controller;

import dto.PatchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.PatchService;

import java.util.Date;
import java.util.List;

/**
 * Created by Dams on 4/08/2014.
 */
@RestController
public class PatchController {

    @Autowired
    PatchService patchService;

    @RequestMapping(value = "/patch", method = RequestMethod.POST)
    public PatchDto create(  @RequestParam(value="date", required = false) Date date,
                             @RequestParam(value="dateStart", required = false) Date dateStart,
                             @RequestParam(value="dateEnd", required = false) Date dateEnd,
                             @RequestParam(value="doctor", required = true) String doctor,
                             @RequestParam(value="nameMedic", required = true) String nameMedic,
                             @RequestParam(value="dosage", required = true) int dosage,
                             @RequestParam(value="unit", required = true) String unit)
    {
        return patchService.save(date,dateStart, dateEnd, doctor, nameMedic, dosage, unit); }

    @RequestMapping(value = "/patch", method = RequestMethod.GET)
    public PatchDto get(
            @RequestParam(value = "id", required = true) long id){
        return patchService.findById(id);
    }

    @RequestMapping(value = "/patch", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        patchService.delete(id);
    }

    @RequestMapping(value = "/patch", method = RequestMethod.PUT)
    public PatchDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="date", required = false) Date date,
            @RequestParam(value="dateStart", required = false) Date dateStart,
            @RequestParam(value="dateEnd", required = false) Date dateEnd,
            @RequestParam(value="doctor", required = false) String doctor,
            @RequestParam(value="nameMedic", required = false, defaultValue = "-1") String nameMedic,
            @RequestParam(value="dosage", required = false, defaultValue = "-1") int dosage,
            @RequestParam(value="unit", required = false, defaultValue = "-1") String unit){

        return patchService.update(id, date, dateStart, dateEnd, doctor, nameMedic, dosage, unit);
    }

    @RequestMapping(value = "/patch/all", method = RequestMethod.GET)
    public List<PatchDto> getAll() {
        return patchService.findAll();
    }
}