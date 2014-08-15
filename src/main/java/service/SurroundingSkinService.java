package service;

import dto.SurroundingSkinDto;
import entity.SurroundingSkin;
import entity.SurroundingSkinRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 12/08/2014.
 */
public class SurroundingSkinService {

    @Resource
    SurroundingSkinRepository surroundingSkinRepository;

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

    public SurroundingSkinDto save(boolean healthy, boolean fragile, boolean dry, boolean hyperpigmented, boolean hyperkeration, boolean inflammatory, boolean macerated, boolean ulcerated) {
        SurroundingSkin surroundingSkin = new SurroundingSkin();
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

    public SurroundingSkinDto update(long id, boolean healthy, boolean fragile, boolean dry, boolean hyperpigmented, boolean hyperkeration, boolean inflammatory, boolean macerated, boolean ulcerated) {
        SurroundingSkin surroundingSkin = surroundingSkinRepository.findOne(id);

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
