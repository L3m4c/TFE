package service;

import dto.WoundDto;
import entity.BoarderRepository;
import entity.User;
import entity.Wound;
import entity.WoundRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 7/08/2014.
 */
public class WoundService {

    @Resource
    WoundRepository woundRepository;
    @Resource
    BoarderRepository boarderRepository;
    @Autowired
    UserService userService;

    public List<WoundDto> findAll() {
        Iterator i = woundRepository.findAll().iterator();
        List<WoundDto> listWound = new ArrayList<WoundDto>();
        while(i.hasNext()) {
            listWound.add(new WoundDto((Wound) i.next()));
        }
        return listWound;
    }

    public WoundDto findById(long id) {
        return new WoundDto(woundRepository.findOne(id));
    }

    public void delete(long id) {
        woundRepository.delete(id);
    }

    public WoundDto save( long idBoarder, Date date,String localisation, String type, String description) {
        User current = userService.getCurrentUser();
        Wound wound = new Wound();
        wound.setBoarder(boarderRepository.findOne(idBoarder));
        wound.setUser(current);
        if(date != null) {
            wound.setDate(date);
        }
        wound.setLocalisation(localisation);
        wound.setType(type);
        wound.setDescription(description);
        return new WoundDto(woundRepository.save(wound));
    }

    public WoundDto update(long id, long idBoarder, Date date, String localisation, String type, String description ) {
        Wound wound = woundRepository.findOne(id);
        if(id != -1) {
            wound.setBoarder(boarderRepository.findOne(idBoarder));
        }
        if(date != null)
            wound.setDate(date);
        if(localisation != null)
            wound.setLocalisation(localisation);
        if(type != null)
            wound.setType(type);
        if(description != null)
            wound.setDescription(description);
        return new WoundDto(woundRepository.save(wound));
    }

}
