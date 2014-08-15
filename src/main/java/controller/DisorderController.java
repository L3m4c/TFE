package controller;

import dto.DisorderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.DisorderService;

import java.util.List;

/**
 * Created by Dams on 9/08/2014.
 */
@RestController
public class DisorderController {

    @Autowired
    DisorderService disorderService;

    @RequestMapping(value = "/disorder", method = RequestMethod.POST)
    public DisorderDto create(
            @RequestParam(value="timeDisorientation", required = true) boolean timeDisorientation,
            @RequestParam(value="spaceDisorientation", required = true) boolean spaceDisorientation,
            @RequestParam(value="termDifficulty", required = true) boolean termDifficulty,
            @RequestParam(value="verbalDifficulty", required = true) boolean verbalDifficulty,
            @RequestParam(value="lossConcept", required = true) boolean lossConcept,
            @RequestParam(value="agitated", required = true) boolean agitated)

    {
        return disorderService.save(timeDisorientation, spaceDisorientation,termDifficulty, verbalDifficulty, lossConcept, agitated); }

    @RequestMapping(value = "/disorder", method = RequestMethod.GET)
    public DisorderDto get(
            @RequestParam(value = "id", required = true) long id){
        return disorderService.findById(id);
    }

    @RequestMapping(value = "/disorder", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        disorderService.delete(id);
    }

    @RequestMapping(value = "/disorder", method = RequestMethod.PUT)
    public DisorderDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="timeDisorientation", required = true) boolean timeDisorientation,
            @RequestParam(value="spaceDisorientation", required = true) boolean spaceDisorientation,
            @RequestParam(value="termDifficulty", required = true) boolean termDifficulty,
            @RequestParam(value="verbalDifficulty", required = true) boolean verbalDifficulty,
            @RequestParam(value="lossConcept", required = true) boolean lossConcept,
            @RequestParam(value="agitated", required = true) boolean agitated)

    {

        return disorderService.update(id, timeDisorientation, spaceDisorientation,termDifficulty, verbalDifficulty, lossConcept, agitated);
    }

    @RequestMapping(value = "/disorder/all", method = RequestMethod.GET)
    public List<DisorderDto> getAll() {
        return disorderService.findAll();
    }





}
