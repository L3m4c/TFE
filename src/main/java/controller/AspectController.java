package controller;

import dto.AspectDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.AspectService;

import java.util.List;

/**
 * Created by Dams on 11/08/2014.
 */
@RestController
public class AspectController {

    @Autowired
    AspectService aspectService;

    @RequestMapping(value = "/aspect", method = RequestMethod.POST)
    public AspectDto create(
            @RequestParam(value="redness", required = true) boolean redness,
            @RequestParam(value="fibrin", required = true) boolean fibrin,
            @RequestParam(value="necrosis", required = true) boolean necrosis,
            @RequestParam(value="pink", required = true) boolean pink,
            @RequestParam(value="other", required = true) String other)

    {
        return aspectService.save(redness, fibrin, necrosis, pink, other); }

    @RequestMapping(value = "/aspect", method = RequestMethod.GET)
    public AspectDto get(
            @RequestParam(value = "id", required = true) long id){
        return aspectService.findById(id);
    }

    @RequestMapping(value = "/aspect", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        aspectService.delete(id);
    }

    @RequestMapping(value = "/aspect", method = RequestMethod.PUT)
    public AspectDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="redness", required = true) boolean redness,
            @RequestParam(value="fibrin", required = true) boolean fibrin,
            @RequestParam(value="necrosis", required = true) boolean necrosis,
            @RequestParam(value="pink", required = true) boolean pink,
            @RequestParam(value="other", required = true) String other)

    {

        return aspectService.update(id, redness, fibrin, necrosis, pink, other);
    }

    @RequestMapping(value = "/aspect/all", method = RequestMethod.GET)
    public List<AspectDto> getAll() {
        return aspectService.findAll();
    }



}
