package service;

import dto.InsulinDosageDto;
import entity.BoarderRepository;
import entity.InsulinDosage;
import entity.InsulinDosageRepository;
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
public class InsulinDosageService {

    @Resource
    InsulinDosageRepository insulinDosageRepository;
    @Resource
    BoarderRepository boarderRepository;
    @Autowired
    UserService userService;

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

    public InsulinDosageDto save( long idBoarder, Date date, int dosage) {
        User current = userService.getCurrentUser();
        InsulinDosage insulinDosage = new InsulinDosage();
        insulinDosage.setBoarder(boarderRepository.findOne(idBoarder));
        if(date != null) {
            insulinDosage.setDate(date);
        }
        insulinDosage.setDosage(dosage);

        return new InsulinDosageDto(insulinDosageRepository.save(insulinDosage));
    }

    public InsulinDosageDto update(long id, long idBoarder, Date date, int dosage) {
        InsulinDosage insulinDosage = insulinDosageRepository.findOne(id);
        if(id != -1) {
            insulinDosage.setBoarder(boarderRepository.findOne(idBoarder));
        }
        if(date != null) {
            insulinDosage.setDate(date);
        }
        if(dosage != -1)
            insulinDosage.setDosage(dosage);

        return new InsulinDosageDto(insulinDosageRepository.save(insulinDosage));
    }


}
