package controller;

import dto.BoarderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

}
