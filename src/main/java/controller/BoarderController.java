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
            public BoarderDto create(@RequestParam(value="room", required = true) int room,
                                  @RequestParam(value="name", required = true) String name,
                                  @RequestParam(value="surname", required = true) String surname,
                                  @RequestParam(value="age", required = true) int age,
                                  @RequestParam(value="dateBirth", required = true) String dateBirth,
                                  @RequestParam(value="mutuel", required = true) String mutuel,
                                  @RequestParam(value="personResponsible", required = true) String personResponsible,
                                  @RequestParam(value="phone", required = true) String phone){


                return boarderService.save(room, name, surname, age, dateBirth, mutuel, personResponsible, phone);
            }

            @RequestMapping(value = "/boarder", method = RequestMethod.DELETE)
            public void delete(
                    @RequestParam(value = "id", required = true) long id) {
                boarderService.delete(id);
            }

            @RequestMapping(value = "/boarder", method = RequestMethod.PUT)
            public BoarderDto update(
                    @RequestParam(value = "id", required = true) long id,
                    @RequestParam(value="room", required = false, defaultValue="-1") int room,
                    @RequestParam(value="name", required = false) String name,
                    @RequestParam(value="surname", required = false) String surname,
                    @RequestParam(value="age", required = false) int age,
                    @RequestParam(value="dateBirth", required = false) String dateBirth,
                    @RequestParam(value="mutuel", required = false) String mutuel,
                    @RequestParam(value="personResponsible", required = false) String personResponsible,
                    @RequestParam(value="phone", required = false) String phone){

                return boarderService.update(id, room, name, surname, age, dateBirth, mutuel, personResponsible, phone);
            }

}
