package controller;

import dto.ToiletHelpingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.ToiletHelpingService;

import java.util.Date;
import java.util.List;

/**
 * Created by Dams on 9/08/2014.
 */
@RestController
public class ToiletHelpingController {

    @Autowired
    ToiletHelpingService toiletHelpingService;

    @RequestMapping(value = "/toiletHelping", method = RequestMethod.POST)
    public ToiletHelpingDto create(
            @RequestParam(value="boarder", required = true) long idBoarder,
            @RequestParam(value="date", required = false) Long dateMill,
            @RequestParam(value="move", required = true) boolean move)

    {
        Date date = new Date();
        if(dateMill != null) {
            date.setTime(dateMill);}

        return toiletHelpingService.save(idBoarder, date, move); }

    @RequestMapping(value = "/toiletHelping", method = RequestMethod.GET)
    public ToiletHelpingDto get(
            @RequestParam(value = "id", required = true) long id){
        return toiletHelpingService.findById(id);
    }

    @RequestMapping(value = "/toiletHelping", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        toiletHelpingService.delete(id);
    }

    @RequestMapping(value = "/toiletHelping", method = RequestMethod.PUT)
    public ToiletHelpingDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="boarder", required = false, defaultValue = "-1") long idBoarder,
            @RequestParam(value="date", required = false) Date date,
            @RequestParam(value="move", required = false) boolean move)

    {

        return toiletHelpingService.update(id, idBoarder, date, move);
    }

    @RequestMapping(value = "/toiletHelping/all", method = RequestMethod.GET)
    public List<ToiletHelpingDto> getAll() {
        return toiletHelpingService.findAll();
    }




}
