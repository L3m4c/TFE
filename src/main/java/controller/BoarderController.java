package controller;

import dto.BoarderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.BoarderService;

import java.util.List;

/**
 * Created by Sl0th on 27/06/2014.
 */
@RestController
public class BoarderController {

    @Autowired
    BoarderService boarderService;

    @RequestMapping(value = "/boarder/all", method = RequestMethod.GET)
    public List<BoarderDto> getAll() {
        return boarderService.findAll();
    }

    @RequestMapping(value = "/boarder", method = RequestMethod.GET)
    public BoarderDto get(
            @RequestParam(value = "id", required = true) long id){
        return boarderService.findById(id);
    }

    @RequestMapping(value = "/boarder", method = RequestMethod.POST)
    public BoarderDto create(@RequestParam(value="chambre", required = true) int chambre,
                          @RequestParam(value="name", required = true) String name,
                          @RequestParam(value="surname", required = true) String surname){
        return boarderService.save(chambre, name, surname);
    }

    @RequestMapping(value = "/boarder", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        boarderService.delete(id);
    }

    @RequestMapping(value = "/boarder", method = RequestMethod.PUT)
    public BoarderDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="chambre", required = false, defaultValue="-1") int chambre,
            @RequestParam(value="name", required = false) String name,
            @RequestParam(value="surname", required = false) String surname){

        return boarderService.update(id, chambre, name, surname);
    }

}
