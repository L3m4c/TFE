package service;

import dto.SurroundingSkinDto;
import entity.BoarderRepository;
import entity.SurroundingSkin;
import entity.SurroundingSkinRepository;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 12/08/2014.
 */
public class SurroundingSkinService {

    @Resource
    SurroundingSkinRepository surroundingSkinRepository;
    @Resource
    BoarderRepository boarderRepository;
    @Autowired
    UserService userService;


    public List<SurroundingSkinDto> findAll() {
        Iterator i = surroundingSkinRepository.findAll().iterator();
        List<SurroundingSkinDto> listSurroundingSkin = new ArrayList<SurroundingSkinDto>();
        while(i.hasNext()) {
            listSurroundingSkin.add(new SurroundingSkinDto((SurroundingSkin)i.next()));
        }
        return listSurroundingSkin;
    }

    public SurroundingSkinDto findById(long id) {
        return new SurroundingSkinDto(surroundingSkinRepository.findOne(id));
    }

    public void delete(long id) {
        surroundingSkinRepository.delete(id);
    }

    public SurroundingSkinDto save(long idBoarder, Date date, boolean healthy, boolean fragile, boolean dry, boolean hyperpigmented, boolean hyperkeration, boolean inflammatory, boolean macerated, boolean ulcerated) {
        SurroundingSkin surroundingSkin = new SurroundingSkin();
        User current = userService.getCurrentUser();
        surroundingSkin.setBoarder(boarderRepository.findOne(idBoarder));
        surroundingSkin.setUser(current);

        if(date != null) {
            surroundingSkin.setDate(date);
        }
        surroundingSkin.setHealthy(healthy);
        surroundingSkin.setFragile(fragile);
        surroundingSkin.setDry(dry);
        surroundingSkin.setHyperpigmented(hyperpigmented);
        surroundingSkin.setHyperkeration(hyperkeration);
        surroundingSkin.setInflammatory(inflammatory);
        surroundingSkin.setMacerated(macerated);
        surroundingSkin.setUlcerated(ulcerated);


        return new SurroundingSkinDto(surroundingSkinRepository.save(surroundingSkin));
    }

    public SurroundingSkinDto update(long id, long idBoarder, Date date, boolean healthy, boolean fragile, boolean dry, boolean hyperpigmented, boolean hyperkeration, boolean inflammatory, boolean macerated, boolean ulcerated) {
        SurroundingSkin surroundingSkin = surroundingSkinRepository.findOne(id);
        if(id != -1) {
            surroundingSkin.setBoarder(boarderRepository.findOne(idBoarder));
        }
        if(date != null)
            surroundingSkin.setDate(date);
        surroundingSkin.setHealthy(healthy);
        surroundingSkin.setFragile(fragile);
        surroundingSkin.setDry(dry);
        surroundingSkin.setHyperpigmented(hyperpigmented);
        surroundingSkin.setHyperkeration(hyperkeration);
        surroundingSkin.setInflammatory(inflammatory);
        surroundingSkin.setMacerated(macerated);
        surroundingSkin.setUlcerated(ulcerated);

        return new SurroundingSkinDto(surroundingSkinRepository.save(surroundingSkin));
    }



}
