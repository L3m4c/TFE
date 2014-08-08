package service;

import dto.DrugTreatmentDto;
import entity.DrugTreatment;
import entity.DrugTreatmentRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 7/08/2014.
 */
public class DrugTreatmentService {

    @Resource
    DrugTreatmentRepository drugTreatmentRepository;

    public List<DrugTreatmentDto> findAll() {
        Iterator i = drugTreatmentRepository.findAll().iterator();
        List<DrugTreatmentDto> listDrugTreatment = new ArrayList<DrugTreatmentDto>();
        while(i.hasNext()) {
            listDrugTreatment.add(new DrugTreatmentDto((DrugTreatment)i.next()));
        }
        return listDrugTreatment;
    }

    public DrugTreatmentDto findById(long id) {
        return new DrugTreatmentDto(drugTreatmentRepository.findOne(id));
    }

    public void delete(long id) {
        drugTreatmentRepository.delete(id);
    }

    public DrugTreatmentDto save(Date dateStart, Date dateEnd, String doctor, String nameMedic, int dosage, String unit, int morning, int midday, int evening, int night) {
        DrugTreatment drugTreatment = new DrugTreatment();
        drugTreatment.setDateStart(dateStart);
        drugTreatment.setDateEnd(dateEnd);
        drugTreatment.setDoctor(doctor);
        drugTreatment.setNameMedic(nameMedic);
        drugTreatment.setDosage(dosage);
        drugTreatment.setUnit(unit);
        drugTreatment.setMorning(morning);
        drugTreatment.setMidday(midday);
        drugTreatment.setEvening(evening);
        drugTreatment.setNight(night);

        return new DrugTreatmentDto(drugTreatmentRepository.save(drugTreatment));
    }

    public DrugTreatmentDto update(long id, Date dateStart, Date dateEnd, String doctor, String nameMedic, int dosage, String unit, int morning, int midday, int evening,int night) {
        DrugTreatment drugTreatment = drugTreatmentRepository.findOne(id);

        if(dateStart != null)
            drugTreatment.setDateStart(dateStart);
        if(dateEnd != null)
            drugTreatment.setDateEnd(dateEnd);
        if(doctor != null)
            drugTreatment.setDoctor(doctor);
        if(nameMedic != null)
            drugTreatment.setNameMedic(nameMedic);
        if(dosage != -1)
            drugTreatment.setDosage(dosage);
        if(unit != null)
            drugTreatment.setUnit(unit);
        if(morning != -1)
            drugTreatment.setMorning(morning);
        if(midday != -1)
            drugTreatment.setMidday(midday);
        if(evening != -1)
            drugTreatment.setEvening(evening);
        if(night != -1)
            drugTreatment.setNight(night);
        return new DrugTreatmentDto(drugTreatmentRepository.save(drugTreatment));
    }

}
