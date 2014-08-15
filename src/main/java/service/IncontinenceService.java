package service;

import dto.IncontinenceDto;
import entity.Incontinence;
import entity.IncontinenceRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 9/08/2014.
 */
public class IncontinenceService {

    @Resource
    IncontinenceRepository incontinenceRepository;

    public List<IncontinenceDto> findAll() {
        Iterator i = incontinenceRepository.findAll().iterator();
        List<IncontinenceDto> listIncontinence = new ArrayList<IncontinenceDto>();
        while(i.hasNext()) {
            listIncontinence.add(new IncontinenceDto((Incontinence)i.next()));
        }
        return listIncontinence;
    }

    public IncontinenceDto findById(long id) {
        return new IncontinenceDto(incontinenceRepository.findOne(id));
    }

    public void delete(long id) {
        incontinenceRepository.delete(id);
    }

    public IncontinenceDto save(boolean diurnal, boolean nocturnal, boolean both) {
        Incontinence incontinence = new Incontinence();
        incontinence.setDiurnal(diurnal);
        incontinence.setNocturnal(nocturnal);
        incontinence.setBoth(both);

        return new IncontinenceDto(incontinenceRepository.save(incontinence));
    }

    public IncontinenceDto update(long id, boolean diurnal, boolean nocturnal, boolean both) {
        Incontinence incontinence = incontinenceRepository.findOne(id);

        incontinence.setDiurnal(diurnal);
        incontinence.setNocturnal(nocturnal);
        incontinence.setBoth(both);

        return new IncontinenceDto(incontinenceRepository.save(incontinence));
    }


}
