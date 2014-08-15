package controller;

import dto.MeasureDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.MeasureService;

import java.util.List;

/**
 * Created by Dams on 11/08/2014.
 */
@RestController
public class MeasureController {

    @Autowired
    MeasureService measureService;

    @RequestMapping(value = "/measure", method = RequestMethod.POST)
    public MeasureDto create(
            @RequestParam(value="size", required = true) int size,
            @RequestParam(value="depth", required = true) int depth,
            @RequestParam(value="quantity", required = true) String quantity,
            @RequestParam(value="nature", required = true) String nature,
            @RequestParam(value="odor", required = true) boolean odor)

    {
        return measureService.save(size, depth, quantity, nature, odor); }

    @RequestMapping(value = "/measure", method = RequestMethod.GET)
    public MeasureDto get(
            @RequestParam(value = "id", required = true) long id){
        return measureService.findById(id);
    }

    @RequestMapping(value = "/measure", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        measureService.delete(id);
    }

    @RequestMapping(value = "/measure", method = RequestMethod.PUT)
    public MeasureDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="size", required = true) int size,
            @RequestParam(value="depth", required = true) int depth,
            @RequestParam(value="quantity", required = true) String quantity,
            @RequestParam(value="nature", required = true) String nature,
            @RequestParam(value="odor", required = true) boolean odor)

    {

        return measureService.update(id, size, depth, quantity, nature, odor);
    }

    @RequestMapping(value = "/measure/all", method = RequestMethod.GET)
    public List<MeasureDto> getAll() {
        return measureService.findAll();
    }


}
