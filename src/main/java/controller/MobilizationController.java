package controller;

import dto.MobilizationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.MobilizationService;

import java.util.List;

/**
 * Created by Dams on 9/08/2014.
 */
@RestController
public class MobilizationController {

    @Autowired
    MobilizationService mobilizationService;

    @RequestMapping(value = "/mobilization", method = RequestMethod.POST)
    public MobilizationDto create(
            @RequestParam(value="help", required = true) boolean help,
            @RequestParam(value="material", required = true) boolean material,
            @RequestParam(value="cane", required = true) boolean cane)

    {
        return mobilizationService.save(help, material, cane); }

    @RequestMapping(value = "/mobilization", method = RequestMethod.GET)
    public MobilizationDto get(
            @RequestParam(value = "id", required = true) long id){
        return mobilizationService.findById(id);
    }

    @RequestMapping(value = "/mobilization", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        mobilizationService.delete(id);
    }

    @RequestMapping(value = "/mobilization", method = RequestMethod.PUT)
    public MobilizationDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="help", required = false) boolean help,
            @RequestParam(value="material", required = false) boolean material,
            @RequestParam(value="cane", required = false) boolean cane)

    {

        return mobilizationService.update(id, help, material, cane);
    }

    @RequestMapping(value = "/mobilization/all", method = RequestMethod.GET)
    public List<MobilizationDto> getAll() {
        return mobilizationService.findAll();
    }

}
