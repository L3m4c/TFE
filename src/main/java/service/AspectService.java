package service;

import dto.AspectDto;
import entity.Aspect;
import entity.AspectRepository;
import entity.BoarderRepository;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 11/08/2014.
 */
public class AspectService {

    @Resource
    AspectRepository aspectRepository;
    @Resource
    BoarderRepository boarderRepository;
    @Autowired
    UserService userService;

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

    public AspectDto save(long idBoarder, Date date, boolean redness, boolean fibrin, boolean necrosis, boolean pink, String aspectOther) {
        Aspect aspect = new Aspect();
        User current = userService.getCurrentUser();
        aspect.setBoarder(boarderRepository.findOne(idBoarder));
        aspect.setUser(current);

        if(date != null) {
            aspect.setDate(date);
        }
        aspect.setRedness(redness);
        aspect.setFibrin(fibrin);
        aspect.setNecrosis(necrosis);
        aspect.setPink(pink);
        aspect.setAspectOther(aspectOther);


        return new AspectDto(aspectRepository.save(aspect));
    }

    public AspectDto update(long id, long idBoarder, Date date, boolean redness, boolean fibrin, boolean necrosis, boolean pink, String aspectOther) {
        Aspect aspect = aspectRepository.findOne(id);
        if(id != -1) {
            aspect.setBoarder(boarderRepository.findOne(idBoarder));
        }
        if(date != null)
            aspect.setDate(date);
        aspect.setRedness(redness);
        aspect.setFibrin(fibrin);
        aspect.setNecrosis(necrosis);
        aspect.setPink(pink);
        aspect.setAspectOther(aspectOther);

        return new AspectDto(aspectRepository.save(aspect));
    }


}
