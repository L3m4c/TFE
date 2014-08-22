package service;

import dto.IncontinenceDto;
import entity.BoarderRepository;
import entity.Incontinence;
import entity.IncontinenceRepository;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 9/08/2014.
 */
public class IncontinenceService {

    @Resource
    IncontinenceRepository incontinenceRepository;
    @Resource
    BoarderRepository boarderRepository;
    @Autowired
    UserService userService;

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

    public IncontinenceDto save(long idBoarder, Date date, boolean diurnal, boolean nocturnal, boolean both) {
        Incontinence incontinence = new Incontinence();
        User current = userService.getCurrentUser();
        incontinence.setBoarder(boarderRepository.findOne(idBoarder));
        incontinence.setUser(current);

        if(date != null) {
            incontinence.setDate(date);
        }
        incontinence.setDiurnal(diurnal);
        incontinence.setNocturnal(nocturnal);
        incontinence.setBoth(both);

        return new IncontinenceDto(incontinenceRepository.save(incontinence));
    }

    public IncontinenceDto update(long id, long idBoarder, Date date, boolean diurnal, boolean nocturnal, boolean both) {
        Incontinence incontinence = incontinenceRepository.findOne(id);
        if(id != -1) {
            incontinence.setBoarder(boarderRepository.findOne(idBoarder));
        }
        if(date != null)
            incontinence.setDate(date);
        incontinence.setDiurnal(diurnal);
        incontinence.setNocturnal(nocturnal);
        incontinence.setBoth(both);

        return new IncontinenceDto(incontinenceRepository.save(incontinence));
    }


}
