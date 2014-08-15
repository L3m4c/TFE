package controller;

import dto.EatDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.EatService;

import java.util.List;

/**
 * Created by Dams on 9/08/2014.
 */
@RestController
public class EatController {

    @Autowired
    EatService eatService;

    @RequestMapping(value = "/eat", method = RequestMethod.POST)
    public EatDto create(
            @RequestParam(value="priorAid", required = true) boolean priorAid,
            @RequestParam(value="fullAid", required = true) boolean fullAid,
            @RequestParam(value="stimulated", required = true) boolean stimulated,
            @RequestParam(value="hydration", required = true) boolean hydration)

    {
        return eatService.save(priorAid, fullAid, stimulated, hydration); }

    @RequestMapping(value = "/eat", method = RequestMethod.GET)
    public EatDto get(
            @RequestParam(value = "id", required = true) long id){
        return eatService.findById(id);
    }

    @RequestMapping(value = "/eat", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        eatService.delete(id);
    }

    @RequestMapping(value = "/eat", method = RequestMethod.PUT)
    public EatDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="priorAid", required = false) boolean priorAid,
            @RequestParam(value="fullAid", required = false) boolean fullAid,
            @RequestParam(value="stimulated", required = false) boolean stimulated,
            @RequestParam(value="hydration", required = false) boolean hydration)

    {

        return eatService.update(id, priorAid, fullAid, stimulated, hydration);
    }

    @RequestMapping(value = "/eat/all", method = RequestMethod.GET)
    public List<EatDto> getAll() {
        return eatService.findAll();
    }


}
