package service;

import dto.TherapeuticDto;
import entity.BoarderRepository;
import entity.Therapeutic;
import entity.TherapeuticRepository;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 8/08/2014.
 */
public class TherapeuticService {

    @Resource
    TherapeuticRepository therapeuticRepository;
    @Resource
    BoarderRepository boarderRepository;
    @Autowired
    UserService userService;

    public List<TherapeuticDto> findAll() {
        Iterator i = therapeuticRepository.findAll().iterator();
        List<TherapeuticDto> listTherapeutic = new ArrayList<TherapeuticDto>();
        while(i.hasNext()) {
            listTherapeutic.add(new TherapeuticDto((Therapeutic)i.next()));
        }
        return listTherapeutic;
    }

    public TherapeuticDto findById(long id) {
        return new TherapeuticDto(therapeuticRepository.findOne(id));
    }

    public void delete(long id) {
        therapeuticRepository.delete(id);
    }

    public TherapeuticDto save(long idBoarder, Date date, boolean preparation, boolean adMorning, boolean adMidday, boolean adEvening, boolean adNight) {
        Therapeutic therapeutic = new Therapeutic();
        User current = userService.getCurrentUser();
        therapeutic.setBoarder(boarderRepository.findOne(idBoarder));
        therapeutic.setUser(current);
        if(date != null) {
            therapeutic.setDate(date);
        }
        therapeutic.setPreparation(preparation);
        therapeutic.setAdMorning(adMorning);
        therapeutic.setAdMidday(adMidday);
        therapeutic.setAdEvening(adEvening);
        therapeutic.setAdNight(adNight);

        return new TherapeuticDto(therapeuticRepository.save(therapeutic));
    }

    public TherapeuticDto update(long id, long idBoarder, Date date, boolean preparation, boolean adMorning, boolean adMidday, boolean adEvening, boolean adNight) {
        Therapeutic therapeutic = therapeuticRepository.findOne(id);

        if(id != -1) {
            therapeutic.setBoarder(boarderRepository.findOne(idBoarder));
        }
        if(date != null)
            therapeutic.setDate(date);
            therapeutic.setPreparation(preparation);

            therapeutic.setAdMorning(adMorning);

            therapeutic.setAdMidday(adMidday);

            therapeutic.setAdEvening(adEvening);

            therapeutic.setAdNight(adNight);

        return new TherapeuticDto(therapeuticRepository.save(therapeutic));
    }

}
