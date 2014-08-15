package service;

import dto.TherapeuticDto;
import entity.Therapeutic;
import entity.TherapeuticRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 8/08/2014.
 */
public class TherapeuticService {

    @Resource
    TherapeuticRepository therapeuticRepository;

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

    public TherapeuticDto save(boolean preparation, boolean adMorning, boolean adMidday, boolean adEvening, boolean adNight) {
        Therapeutic therapeutic = new Therapeutic();
        therapeutic.setPreparation(preparation);
        therapeutic.setAdMorning(adMorning);
        therapeutic.setAdMidday(adMidday);
        therapeutic.setAdEvening(adEvening);
        therapeutic.setAdNight(adNight);

        return new TherapeuticDto(therapeuticRepository.save(therapeutic));
    }

    public TherapeuticDto update(long id, boolean preparation, boolean adMorning, boolean adMidday, boolean adEvening, boolean adNight) {
        Therapeutic therapeutic = therapeuticRepository.findOne(id);


            therapeutic.setPreparation(preparation);

            therapeutic.setAdMorning(adMorning);

            therapeutic.setAdMidday(adMidday);

            therapeutic.setAdEvening(adEvening);

            therapeutic.setAdNight(adNight);

        return new TherapeuticDto(therapeuticRepository.save(therapeutic));
    }

}
