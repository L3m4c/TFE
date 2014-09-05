package service;

import dto.TreatmentDto;
import entity.BoarderRepository;
import entity.Treatment;
import entity.TreatmentRepository;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 12/08/2014.
 */
public class TreatmentService {

    @Resource
    TreatmentRepository treatmentRepository;
    @Resource
    BoarderRepository boarderRepository;
    @Autowired
    UserService userService;

    public List<TreatmentDto> findAll() {
        Iterator i = treatmentRepository.findAll().iterator();
        List<TreatmentDto> listTreatment = new ArrayList<TreatmentDto>();
        while(i.hasNext()) {
            listTreatment.add(new TreatmentDto((Treatment)i.next()));
        }
        return listTreatment;
    }

    public TreatmentDto findById(long id) {
        return new TreatmentDto(treatmentRepository.findOne(id));
    }

    public void delete(long id) {
        treatmentRepository.delete(id);
    }

    public TreatmentDto save(long idBoarder, Date date, boolean pst, boolean irrigation, boolean therapeuticBath, int drillWidth, int drillLength, boolean debridement, String treatmentOther) {
        Treatment treatment = new Treatment();
        User current = userService.getCurrentUser();
        treatment.setBoarder(boarderRepository.findOne(idBoarder));
        treatment.setUser(current);

        if(date != null) {
            treatment.setDate(date);
        }
        treatment.setPst(pst);
        treatment.setIrrigation(irrigation);
        treatment.setTherapeuticBath(therapeuticBath);
        treatment.setDrillWidth(drillWidth);
        treatment.setDrillLength(drillLength);
        treatment.setDebridement(debridement);
        treatment.setTreatmentOther(treatmentOther);

        return new TreatmentDto(treatmentRepository.save(treatment));
    }

    public TreatmentDto update(long id, long idBoarder, Date date, boolean pst, boolean irrigation, boolean therapeuticBath, int drillWidth, int drillLength, boolean debridement, String treatmentOther) {
        Treatment treatment = treatmentRepository.findOne(id);
        if(id != -1) {
            treatment.setBoarder(boarderRepository.findOne(idBoarder));
        }
        if(date != null)
            treatment.setDate(date);
        treatment.setPst(pst);
        treatment.setIrrigation(irrigation);
        treatment.setTherapeuticBath(therapeuticBath);
        treatment.setDrillWidth(drillWidth);
        treatment.setDrillLength(drillLength);
        treatment.setDebridement(debridement);
        treatment.setTreatmentOther(treatmentOther);

        return new TreatmentDto(treatmentRepository.save(treatment));
    }


}
