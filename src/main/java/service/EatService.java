package service;

import dto.EatDto;
import entity.Eat;
import entity.EatRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 9/08/2014.
 */
public class EatService {

    @Resource
    EatRepository eatRepository;

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

    public EatDto save(boolean priorAid, boolean fullAid, boolean stimulated, boolean hydration) {
        Eat eat = new Eat();
        eat.setPriorAid(priorAid);
        eat.setFullAid(fullAid);
        eat.setStimulated(stimulated);
        eat.setHydration(hydration);


        return new EatDto(eatRepository.save(eat));
    }

    public EatDto update(long id, boolean priorAid, boolean fullAid, boolean stimulated, boolean hydration) {
        Eat eat = eatRepository.findOne(id);


        eat.setPriorAid(priorAid);
        eat.setFullAid(fullAid);
        eat.setStimulated(stimulated);
        eat.setHydration(hydration);

        return new EatDto(eatRepository.save(eat));
    }

}
