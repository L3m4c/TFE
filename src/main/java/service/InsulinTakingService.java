package service;

import dto.InsulinTakingDto;
import entity.BoarderRepository;
import entity.InsulinTaking;
import entity.InsulinTakingRepository;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 6/08/2014.
 */

public class InsulinTakingService {

    @Resource
    InsulinTakingRepository insulinTakingRepository;
    @Resource
    BoarderRepository boarderRepository;
    @Autowired
    UserService userService;

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

    public InsulinTakingDto save( long idBoarder, Date date, int glycemia) {
        InsulinTaking insulinTaking = new InsulinTaking();
        User current = userService.getCurrentUser();
        insulinTaking.setBoarder(boarderRepository.findOne(idBoarder));
        insulinTaking.setUser(current);
        if(date != null) {
            insulinTaking.setDate(date);
        }
        insulinTaking.setGlycemia(glycemia);

        return new InsulinTakingDto(insulinTakingRepository.save(insulinTaking));
    }

    public InsulinTakingDto update(long id, long idBoarder, Date date, int glycemia) {
        InsulinTaking insulinTaking = insulinTakingRepository.findOne(id);
        if(id != -1) {
            insulinTaking.setBoarder(boarderRepository.findOne(idBoarder));
        }
        if(date != null) {
            insulinTaking.setDate(date);
        }
        if(glycemia != -1)
            insulinTaking.setGlycemia(glycemia);

        return new InsulinTakingDto(insulinTakingRepository.save(insulinTaking));
    }

}
