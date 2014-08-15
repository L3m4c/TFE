package controller;

import dto.TreatmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.TreatmentService;

import java.util.List;

/**
 * Created by Dams on 12/08/2014.
 */
@RestController
public class TreatmentController {

    @Autowired
    TreatmentService treatmentService;

    @RequestMapping(value = "/treatment", method = RequestMethod.POST)
    public TreatmentDto create(
            @RequestParam(value="pst", required = true) boolean pst,
            @RequestParam(value="irrigation", required = true) boolean irrigation,
            @RequestParam(value="therapeuticBath", required = true) boolean therapeuticBath,
            @RequestParam(value="drillWidth", required = true) int drillWidth,
            @RequestParam(value="drillLength", required = true) int drillLength,
            @RequestParam(value="debridement", required = true) boolean debridement,
            @RequestParam(value="other", required = true) String other)

    {
        return treatmentService.save(pst, irrigation, therapeuticBath, drillWidth, drillLength, debridement, other); }

    @RequestMapping(value = "/treatment", method = RequestMethod.GET)
    public TreatmentDto get(
            @RequestParam(value = "id", required = true) long id){
        return treatmentService.findById(id);
    }

    @RequestMapping(value = "/treatment", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        treatmentService.delete(id);
    }

    @RequestMapping(value = "/treatment", method = RequestMethod.PUT)
    public TreatmentDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="pst", required = true) boolean pst,
            @RequestParam(value="irrigation", required = true) boolean irrigation,
            @RequestParam(value="therapeuticBath", required = true) boolean therapeuticBath,
            @RequestParam(value="drillWidth", required = true) int drillWidth,
            @RequestParam(value="drillLength", required = true) int drillLength,
            @RequestParam(value="debridement", required = true) boolean debridement,
            @RequestParam(value="other", required = true) String other)

    {

        return treatmentService.update(id, pst, irrigation, therapeuticBath, drillWidth, drillLength, debridement, other);
    }

    @RequestMapping(value = "/treatment/all", method = RequestMethod.GET)
    public List<TreatmentDto> getAll() {
        return treatmentService.findAll();
    }


}
