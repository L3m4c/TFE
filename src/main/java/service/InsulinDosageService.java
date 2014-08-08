package service;

import dto.InsulinDosageDto;
import entity.InsulinDosage;
import entity.InsulinDosageRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 6/08/2014.
 */
public class InsulinDosageService {

    @Resource
    InsulinDosageRepository insulinDosageRepository;

    public List<InsulinDosageDto> findAll() {
        Iterator i = insulinDosageRepository.findAll().iterator();
        List<InsulinDosageDto> listInsulinDosage = new ArrayList<InsulinDosageDto>();
        while(i.hasNext()) {
            listInsulinDosage.add(new InsulinDosageDto((InsulinDosage)i.next()));
        }
        return listInsulinDosage;
    }

    public InsulinDosageDto findById(long id) {
        return new InsulinDosageDto(insulinDosageRepository.findOne(id));
    }

    public void delete(long id) {
        insulinDosageRepository.delete(id);
    }

    public InsulinDosageDto save( int morning, int midday, int evening, int night) {
        InsulinDosage insulinDosage = new InsulinDosage();
        insulinDosage.setMorning(morning);
        insulinDosage.setMidday(midday);
        insulinDosage.setEvening(evening);
        insulinDosage.setNight(night);

        return new InsulinDosageDto(insulinDosageRepository.save(insulinDosage));
    }

    public InsulinDosageDto update(long id, int morning, int midday, int evening, int night) {
        InsulinDosage insulinDosage = insulinDosageRepository.findOne(id);

        if(morning != -1)
            insulinDosage.setMorning(morning);
        if(midday != -1)
            insulinDosage.setMidday(midday);
        if(evening != -1)
            insulinDosage.setEvening(evening);
        if(night != -1)
            insulinDosage.setNight(night);
        return new InsulinDosageDto(insulinDosageRepository.save(insulinDosage));
    }


}
