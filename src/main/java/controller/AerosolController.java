package controller;

import dto.AerosolDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.AerosolService;

import java.util.Date;
import java.util.List;

/**
 * Created by Dams on 4/08/2014.
 */
@RestController
public class AerosolController {

    @Autowired
    AerosolService aerosolService;

    @RequestMapping(value = "/aerosol", method = RequestMethod.POST)
    public AerosolDto create(@RequestParam(value="time1", required = true) long time1,
                             @RequestParam(value="date", required = false) Date date,
                             @RequestParam(value="nameMedic", required = true) String nameMedic,
                             @RequestParam(value="dosage", required = true) int dosage,
                             @RequestParam(value="unit", required = true) String unit)
    {
        return aerosolService.save(time1, date, nameMedic, dosage, unit); }

    @RequestMapping(value = "/aerosol", method = RequestMethod.GET)
    public AerosolDto get(
            @RequestParam(value = "id", required = true) long id){
        return aerosolService.findById(id);
    }

    @RequestMapping(value = "/aerosol", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        aerosolService.delete(id);
    }

    @RequestMapping(value = "/aerosol", method = RequestMethod.PUT)
    public AerosolDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="time1", required = false, defaultValue = "-1") long time1,
            @RequestParam(value="date", required = false) Date date,
            @RequestParam(value="nameMedic", required = false, defaultValue = "-1") String nameMedic,
            @RequestParam(value="dosage", required = false, defaultValue = "-1") int dosage,
            @RequestParam(value="unit", required = false, defaultValue = "-1") String unit){

        return aerosolService.update(id, time1, date, nameMedic, dosage, unit);
    }

    @RequestMapping(value = "/aerosol/all", method = RequestMethod.GET)
    public List<AerosolDto> getAll() {
        return aerosolService.findAll();
    }
}
