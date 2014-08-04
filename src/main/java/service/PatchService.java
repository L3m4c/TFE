package service;

import dto.PatchDto;
import entity.AerosolRepository;
import entity.Patch;
import entity.PatchRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 4/08/2014.
 */
public class PatchService {

    @Resource
    PatchRepository patchRepository;

    @Resource
    AerosolRepository aerosolRepository;

    public List<PatchDto> findAll() {
        Iterator i = patchRepository.findAll().iterator();
        List<PatchDto> listPatch = new ArrayList<PatchDto>();
        while(i.hasNext()) {
            listPatch.add(new PatchDto((Patch)i.next()));
        }
        return listPatch;
    }

    public PatchDto findById(long id) {
        return new PatchDto(patchRepository.findOne(id));
    }

    public void delete(long id) {
        patchRepository.delete(id);
    }

    public PatchDto save(Date date, Date dateStart, Date dateEnd, String doctor, String nameMedic, int dosage, String unit) {
        Patch patch = new Patch();
        if(date != null) {
            patch.setDate(date);
        }
        patch.setDateStart(dateStart);
        patch.setDateEnd(dateEnd);
        patch.setDoctor(doctor);
        patch.setNameMedic(nameMedic);
        patch.setDosage(dosage);
        patch.setUnit(unit);
        return new PatchDto(patchRepository.save(patch));
    }

    public PatchDto update(long id, Date date, Date dateStart, Date dateEnd, String doctor, String nameMedic, int dosage, String unit ) {
        Patch patch = patchRepository.findOne(id);

        if(date != null)
            patch.setDate(date);
        if(dateStart != null)
            patch.setDateStart(dateStart);
        if(dateEnd != null)
            patch.setDateEnd(dateEnd);
        if(doctor != null)
            patch.setDoctor(doctor);
        if(nameMedic != null)
            patch.setNameMedic(nameMedic);
        if(dosage != -1)
            patch.setDosage(dosage);
        if(unit != null)
            patch.setUnit(unit);
        return new PatchDto(patchRepository.save(patch));
    }

}
