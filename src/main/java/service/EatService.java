package service;

import dto.EatDto;
import entity.BoarderRepository;
import entity.Eat;
import entity.EatRepository;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 9/08/2014.
 */
public class EatService {

    @Resource
    EatRepository eatRepository;
    @Resource
    BoarderRepository boarderRepository;
    @Autowired
    UserService userService;

    public List<EatDto> findAll() {
        Iterator i = eatRepository.findAll().iterator();
        List<EatDto> listEat = new ArrayList<EatDto>();
        while(i.hasNext()) {
            listEat.add(new EatDto((Eat)i.next()));
        }
        return listEat;
    }

    public EatDto findById(long id) {
        return new EatDto(eatRepository.findOne(id));
    }

    public void delete(long id) {
        eatRepository.delete(id);
    }

    public EatDto save(long idBoarder, Date date, boolean priorAid, boolean fullAid, boolean eatStimulated, boolean hydration) {
        Eat eat = new Eat();
        User current = userService.getCurrentUser();
        eat.setBoarder(boarderRepository.findOne(idBoarder));
        eat.setUser(current);

        if(date != null) {
            eat.setDate(date);
        }
        eat.setPriorAid(priorAid);
        eat.setFullAid(fullAid);
        eat.setEatStimulated(eatStimulated);
        eat.setHydration(hydration);


        return new EatDto(eatRepository.save(eat));
    }

    public EatDto update(long id, long idBoarder, Date date, boolean priorAid, boolean fullAid, boolean eatStimulated, boolean hydration) {
        Eat eat = eatRepository.findOne(id);

        if(id != -1) {
            eat.setBoarder(boarderRepository.findOne(idBoarder));
        }
        if(date != null)
            eat.setDate(date);
        eat.setPriorAid(priorAid);
        eat.setFullAid(fullAid);
        eat.setEatStimulated(eatStimulated);
        eat.setHydration(hydration);

        return new EatDto(eatRepository.save(eat));
    }

}
