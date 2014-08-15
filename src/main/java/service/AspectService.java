package service;

import dto.AspectDto;
import entity.Aspect;
import entity.AspectRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 11/08/2014.
 */
public class AspectService {

    @Resource
    AspectRepository aspectRepository;

    public List<AspectDto> findAll() {
        Iterator i = aspectRepository.findAll().iterator();
        List<AspectDto> listAspect = new ArrayList<AspectDto>();
        while(i.hasNext()) {
            listAspect.add(new AspectDto((Aspect)i.next()));
        }
        return listAspect;
    }

    public AspectDto findById(long id) {
        return new AspectDto(aspectRepository.findOne(id));
    }

    public void delete(long id) {
        aspectRepository.delete(id);
    }

    public AspectDto save(boolean redness, boolean fibrin, boolean necrosis, boolean pink, String other) {
        Aspect aspect = new Aspect();
        aspect.setRedness(redness);
        aspect.setFibrin(fibrin);
        aspect.setNecrosis(necrosis);
        aspect.setPink(pink);
        aspect.setOther(other);


        return new AspectDto(aspectRepository.save(aspect));
    }

    public AspectDto update(long id, boolean redness, boolean fibrin, boolean necrosis, boolean pink, String other) {
        Aspect aspect = aspectRepository.findOne(id);

        aspect.setRedness(redness);
        aspect.setFibrin(fibrin);
        aspect.setNecrosis(necrosis);
        aspect.setPink(pink);
        aspect.setOther(other);

        return new AspectDto(aspectRepository.save(aspect));
    }


}
