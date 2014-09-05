package controller;

import dto.InjectionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.InjectionService;

import java.util.Date;
import java.util.List;

/**
 * Created by Dams on 5/08/2014.
 */
@RestController
public class InjectionController {

    @Autowired
    InjectionService injectionService;

    @RequestMapping(value = "/injection", method = RequestMethod.POST)
    public InjectionDto create(@RequestParam(value="boarder", required = true) long idBoarder,
                               @RequestParam(value="date", required = false) Long dateMill,
                             @RequestParam(value="dateStart", required = false) Date dateStart,
                             @RequestParam(value="dateEnd", required = false) Date dateEnd,
                             @RequestParam(value="doctor", required = true) String doctor,
                             @RequestParam(value="establishment", required = true) String establishment,
                             @RequestParam(value="nameMedic", required = true) String nameMedic,
                             @RequestParam(value="dosage", required = true) int dosage,
                             @RequestParam(value="unit", required = true) String unit)
    {
        Date date = new Date();
        if(dateMill != null) {
            date.setTime(dateMill);
        }
        return injectionService.save(idBoarder, date, dateStart, dateEnd, doctor, establishment, nameMedic, dosage, unit); }

    @RequestMapping(value = "/injection", method = RequestMethod.GET)
    public InjectionDto get(
            @RequestParam(value = "id", required = true) long id){
        return injectionService.findById(id);
    }

    @RequestMapping(value = "/injection", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        injectionService.delete(id);
    }

    @RequestMapping(value = "/injection", method = RequestMethod.PUT)
    public InjectionDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="boarder", required = false) long idBoarder,
            @RequestParam(value="date", required = false) long date,
            @RequestParam(value="dateStart", required = false) Date dateStart,
            @RequestParam(value="dateEnd", required = false) Date dateEnd,
            @RequestParam(value="doctor", required = false) String doctor,
            @RequestParam(value="establishment", required = false) String establishment,
            @RequestParam(value="nameMedic", required = false) String nameMedic,
            @RequestParam(value="dosage", required = false) int dosage,
            @RequestParam(value="unit", required = false) String unit){

        Date dateFormat = new Date();
        dateFormat.setTime(date);
        return injectionService.update(id, idBoarder, dateFormat, null, null, doctor, establishment, nameMedic, dosage, unit);
    }

    @RequestMapping(value = "/injection/all", method = RequestMethod.GET)
    public List<InjectionDto> getAll() {
        return injectionService.findAll();
    }

}
