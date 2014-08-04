package service;

import dto.AerosolDto;
import entity.Aerosol;
import entity.AerosolRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 4/08/2014.
 */
public class AerosolService {

    @Resource
    AerosolRepository aerosolRepository;

    public List<AerosolDto> findAll() {
        Iterator i = aerosolRepository.findAll().iterator();
        List<AerosolDto> listAerosol = new ArrayList<AerosolDto>();
        while(i.hasNext()) {
            listAerosol.add(new AerosolDto((Aerosol)i.next()));
        }
        return listAerosol;
    }

    public AerosolDto findById(long id) {
        return new AerosolDto(aerosolRepository.findOne(id));
    }

    public void delete(long id) {
        aerosolRepository.delete(id);
    }

    public AerosolDto save(Long time1, Date date, String nameMedic, int dosage, String unit) {
        Aerosol aerosol = new Aerosol();
        aerosol.setTime1(time1);
        if(date != null) {
            aerosol.setDate(date);
        }
        aerosol.setDosage(dosage);
        aerosol.setNameMedic(nameMedic);
        aerosol.setUnit(unit);
        return new AerosolDto(aerosolRepository.save(aerosol));
    }

    public AerosolDto update(long id, Long time1, Date date, String nameMedic, int dosage, String unit ) {
        Aerosol aerosol = aerosolRepository.findOne(id);

        if(time1 != null)
            aerosol.setTime1(time1);
        if(date != null)
            aerosol.setDate(date);
        if(nameMedic != null)
            aerosol.setNameMedic(nameMedic);
        if(dosage != -1)
            aerosol.setDosage(dosage);
        if(unit != null)
            aerosol.setUnit(unit);
        return new AerosolDto(aerosolRepository.save(aerosol));
    }
}
