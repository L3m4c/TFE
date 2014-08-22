package service;

import dto.MobilizationDto;
import entity.BoarderRepository;
import entity.Mobilization;
import entity.MobilizationRepository;
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
public class MobilizationService {

    @Resource
    MobilizationRepository mobilizationRepository;
    @Resource
    BoarderRepository boarderRepository;
    @Autowired
    UserService userService;


    public List<MobilizationDto> findAll() {
        Iterator i = mobilizationRepository.findAll().iterator();
        List<MobilizationDto> listMobilization = new ArrayList<MobilizationDto>();
        while(i.hasNext()) {
            listMobilization.add(new MobilizationDto((Mobilization)i.next()));
        }
        return listMobilization;
    }

    public MobilizationDto findById(long id) {
        return new MobilizationDto(mobilizationRepository.findOne(id));
    }

    public void delete(long id) {
        mobilizationRepository.delete(id);
    }

    public MobilizationDto save(long idBoarder, Date date, boolean help, boolean material, boolean cane) {
        Mobilization mobilization = new Mobilization();
        User current = userService.getCurrentUser();
        mobilization.setBoarder(boarderRepository.findOne(idBoarder));
        mobilization.setUser(current);

        if(date != null) {
            mobilization.setDate(date);
        }
        mobilization.setHelp(help);
        mobilization.setMaterial(material);
        mobilization.setCane(cane);

        return new MobilizationDto(mobilizationRepository.save(mobilization));
    }

    public MobilizationDto update(long id, long idBoarder, Date date, boolean help, boolean material, boolean cane) {
        Mobilization mobilization = mobilizationRepository.findOne(id);
        if(id != -1) {
            mobilization.setBoarder(boarderRepository.findOne(idBoarder));
        }
        if(date != null)
            mobilization.setDate(date);
        mobilization.setHelp(help);
        mobilization.setMaterial(material);
        mobilization.setCane(cane);

        return new MobilizationDto(mobilizationRepository.save(mobilization));
    }




}
