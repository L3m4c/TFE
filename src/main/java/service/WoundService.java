package service;

import dto.WoundDto;
import entity.Wound;
import entity.WoundRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 7/08/2014.
 */
public class WoundService {

    @Resource
    WoundRepository woundRepository;

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

    public WoundDto save( String localisation, String type, String description) {
        Wound wound = new Wound();
        wound.setLocalisation(localisation);
        wound.setType(type);
        wound.setDescription(description);
        return new WoundDto(woundRepository.save(wound));
    }

    public WoundDto update(long id, String localisation, String type, String description ) {
        Wound wound = woundRepository.findOne(id);
        if(localisation != null)
            wound.setLocalisation(localisation);
        if(type != null)
            wound.setType(type);
        if(description != null)
            wound.setDescription(description);
        return new WoundDto(woundRepository.save(wound));
    }

}
