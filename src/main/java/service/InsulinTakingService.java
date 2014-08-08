package service;

import dto.InsulinTakingDto;
import entity.InsulinTaking;
import entity.InsulinTakingRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 6/08/2014.
 */

public class InsulinTakingService {

    @Resource
    InsulinTakingRepository insulinTakingRepository;

    public List<InsulinTakingDto> findAll() {
        Iterator i = insulinTakingRepository.findAll().iterator();
        List<InsulinTakingDto> listInsulinTaking = new ArrayList<InsulinTakingDto>();
        while(i.hasNext()) {
            listInsulinTaking.add(new InsulinTakingDto((InsulinTaking)i.next()));
        }
        return listInsulinTaking;
    }

    public InsulinTakingDto findById(long id) {
        return new InsulinTakingDto(insulinTakingRepository.findOne(id));
    }

    public void delete(long id) {
        insulinTakingRepository.delete(id);
    }

    public InsulinTakingDto save( int morning, int midday, int evening) {
        InsulinTaking insulinTaking = new InsulinTaking();
        insulinTaking.setMorning(morning);
        insulinTaking.setMidday(midday);
        insulinTaking.setEvening(evening);

        return new InsulinTakingDto(insulinTakingRepository.save(insulinTaking));
    }

    public InsulinTakingDto update(long id, int morning, int midday, int evening) {
        InsulinTaking insulinTaking = insulinTakingRepository.findOne(id);

        if(morning != -1)
            insulinTaking.setMorning(morning);
        if(midday != -1)
            insulinTaking.setMidday(midday);
        if(evening != -1)
            insulinTaking.setEvening(evening);

        return new InsulinTakingDto(insulinTakingRepository.save(insulinTaking));
    }

}
