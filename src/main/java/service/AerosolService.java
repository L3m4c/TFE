package service;

import dto.AerosolDto;
import entity.Aerosol;
import entity.AerosolRepository;
import entity.BoarderRepository;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

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
    @Resource
    BoarderRepository boarderRepository;
    @Autowired
    UserService userService;

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

    public AerosolDto save(long idBoarder, Date date, Date dateStart, Date dateEnd, String doctor, String nameMedic, int dosage, String unit) {
        User current = userService.getCurrentUser();
        Aerosol aerosol = new Aerosol();
        aerosol.setBoarder(boarderRepository.findOne(idBoarder));
        aerosol.setUser(current);
        if(date != null) {
            aerosol.setDate(date);
        }
        aerosol.setDateStart(dateStart);
        aerosol.setDateEnd(dateEnd);
        aerosol.setDoctor(doctor);
        aerosol.setNameMedic(nameMedic);
        aerosol.setDosage(dosage);
        aerosol.setUnit(unit);
        return new AerosolDto(aerosolRepository.save(aerosol));
    }

    public AerosolDto update(long id, long idBoarder, Date date, Date dateStart, Date dateEnd, String doctor, String nameMedic, int dosage, String unit) {
        Aerosol aerosol = aerosolRepository.findOne(id);

        if(id != -1) {
            aerosol.setBoarder(boarderRepository.findOne(idBoarder));
        }
        if(date != null)
            aerosol.setDate(date);
        if(dateStart != null)
            aerosol.setDateStart(dateStart);
        if(dateEnd != null)
            aerosol.setDateEnd(dateEnd);
        if(doctor != null)
            aerosol.setDoctor(doctor);
        if(nameMedic != null)
            aerosol.setNameMedic(nameMedic);
        if(dosage != -1)
            aerosol.setDosage(dosage);
        if(unit != null)
            aerosol.setUnit(unit);
        return new AerosolDto(aerosolRepository.save(aerosol));
    }
}
