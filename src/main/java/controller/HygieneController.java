package controller;

import dto.HygieneDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.HygieneService;

import java.util.List;

/**
 * Created by Dams on 8/08/2014.
 */
@RestController
public class HygieneController {

    @Autowired
    HygieneService hygieneService;

    @RequestMapping(value = "/hygiene", method = RequestMethod.POST)
    public HygieneDto create(
            @RequestParam(value="toiletPartiel", required = true) boolean toiletPartiel,
            @RequestParam(value="toiletComplete", required = true) boolean toiletComplete,
            @RequestParam(value="stimulated", required = true) boolean stimulated,
            @RequestParam(value="bath", required = true) boolean bath)

    {
        return hygieneService.save(toiletPartiel, toiletComplete, stimulated, bath); }

    @RequestMapping(value = "/hygiene", method = RequestMethod.GET)
    public HygieneDto get(
            @RequestParam(value = "id", required = true) long id){
        return hygieneService.findById(id);
    }

    @RequestMapping(value = "/hygiene", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        hygieneService.delete(id);
    }

    @RequestMapping(value = "/hygiene", method = RequestMethod.PUT)
    public HygieneDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="toiletPartiel", required = false) boolean toiletPartiel,
            @RequestParam(value="toiletComplete", required = false) boolean toiletComplete,
            @RequestParam(value="stimulated", required = false) boolean stimulated,
            @RequestParam(value="bath", required = false) boolean bath)

    {

        return hygieneService.update(id, toiletPartiel, toiletComplete, stimulated, bath);
    }

    @RequestMapping(value = "/hygiene/all", method = RequestMethod.GET)
    public List<HygieneDto> getAll() {
        return hygieneService.findAll();
    }
}
