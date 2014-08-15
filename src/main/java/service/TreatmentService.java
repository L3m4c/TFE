package service;

import dto.TreatmentDto;
import entity.Treatment;
import entity.TreatmentRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 12/08/2014.
 */
public class TreatmentService {

    @Resource
    TreatmentRepository treatmentRepository;

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

    public TreatmentDto save(boolean pst, boolean irrigation, boolean therapeuticBath, int drillWidth, int drillLength, boolean debridement, String other) {
        Treatment treatment = new Treatment();
        treatment.setPst(pst);
        treatment.setIrrigation(irrigation);
        treatment.setTherapeuticBath(therapeuticBath);
        treatment.setDrillWidth(drillWidth);
        treatment.setDrillLength(drillLength);
        treatment.setDebridement(debridement);
        treatment.setOther(other);

        return new TreatmentDto(treatmentRepository.save(treatment));
    }

    public TreatmentDto update(long id, boolean pst, boolean irrigation, boolean therapeuticBath, int drillWidth, int drillLength, boolean debridement, String other) {
        Treatment treatment = treatmentRepository.findOne(id);

        treatment.setPst(pst);
        treatment.setIrrigation(irrigation);
        treatment.setTherapeuticBath(therapeuticBath);
        treatment.setDrillWidth(drillWidth);
        treatment.setDrillLength(drillLength);
        treatment.setDebridement(debridement);
        treatment.setOther(other);

        return new TreatmentDto(treatmentRepository.save(treatment));
    }


}
