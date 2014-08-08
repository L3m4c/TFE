package controller;

import dto.DrugTreatmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.DrugTreatmentService;

import java.util.Date;
import java.util.List;

/**
 * Created by Dams on 7/08/2014.
 */
@RestController
public class DrugTreatmentController {

    @Autowired
    DrugTreatmentService drugTreatmentService;

    @RequestMapping(value = "/drugTreatment", method = RequestMethod.POST)
    public DrugTreatmentDto create(
                               @RequestParam(value="dateStart", required = false) Date dateStart,
                               @RequestParam(value="dateEnd", required = false) Date dateEnd,
                               @RequestParam(value="doctor", required = true) String doctor,
                               @RequestParam(value="nameMedic", required = true) String nameMedic,
                               @RequestParam(value="dosage", required = true) int dosage,
                               @RequestParam(value="unit", required = true) String unit,
                               @RequestParam(value="morning", required = true) int morning,
                               @RequestParam(value="midday", required = true) int midday,
                               @RequestParam(value="evening", required = true) int evening,
                               @RequestParam(value="night", required = true) int night)
    {
        return drugTreatmentService.save(dateStart, dateEnd, doctor, nameMedic, dosage, unit, morning, midday, evening, night); }

    @RequestMapping(value = "/drugTreatment", method = RequestMethod.GET)
    public DrugTreatmentDto get(
            @RequestParam(value = "id", required = true) long id){
        return drugTreatmentService.findById(id);
    }

    @RequestMapping(value = "/drugTreatment", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        drugTreatmentService.delete(id);
    }

    @RequestMapping(value = "/drugTreatment", method = RequestMethod.PUT)
    public DrugTreatmentDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="dateStart", required = false) Date dateStart,
            @RequestParam(value="dateEnd", required = false) Date dateEnd,
            @RequestParam(value="doctor", required = false) String doctor,
            @RequestParam(value="nameMedic", required = false) String nameMedic,
            @RequestParam(value="dosage", required = false) int dosage,
            @RequestParam(value="unit", required = false) String unit,
            @RequestParam(value="morning", required = false) int morning,
            @RequestParam(value="midday", required = false) int midday,
            @RequestParam(value="evening", required = false) int evening,
            @RequestParam(value="night", required = false) int night){

        return drugTreatmentService.update(id, dateStart, dateEnd, doctor, nameMedic, dosage, unit, morning, midday, evening, night);
    }

    @RequestMapping(value = "/drugTreatment/all", method = RequestMethod.GET)
    public List<DrugTreatmentDto> getAll() {
        return drugTreatmentService.findAll();
    }
}
