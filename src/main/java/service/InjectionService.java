package service;

import dto.InjectionDto;
import entity.BoarderRepository;
import entity.Injection;
import entity.InjectionRepository;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 5/08/2014.
 */
public class InjectionService {

    @Resource
    InjectionRepository injectionRepository;
    @Resource
    BoarderRepository boarderRepository;
    @Autowired
    UserService userService;

    public List<InjectionDto> findAll() {
        Iterator i = injectionRepository.findAll().iterator();
        List<InjectionDto> listInjection = new ArrayList<InjectionDto>();
        while(i.hasNext()) {
            listInjection.add(new InjectionDto((Injection)i.next()));
        }
        return listInjection;
    }

    public InjectionDto findById(long id) {
        return new InjectionDto(injectionRepository.findOne(id));
    }

    public void delete(long id) {
        injectionRepository.delete(id);
    }

    public InjectionDto save(long idBoarder, Date date, Date dateStart, Date dateEnd, String doctor, String establishment, String nameMedic, int dosage, String unit) {
        Injection injection = new Injection();
        User current = userService.getCurrentUser();
        injection.setBoarder(boarderRepository.findOne(idBoarder));
        injection.setUser(current);
        if(date != null) {
            injection.setDate(date);
        }
        injection.setDateStart(dateStart);
        injection.setDateEnd(dateEnd);
        injection.setDoctor(doctor);
        injection.setEstablishment(establishment);
        injection.setNameMedic(nameMedic);
        injection.setDosage(dosage);
        injection.setUnit(unit);
        return new InjectionDto(injectionRepository.save(injection));
    }

    public InjectionDto update(long id, long idBoarder, Date date, Date dateStart, Date dateEnd, String doctor, String establishment, String nameMedic, int dosage, String unit ) {
        Injection injection = injectionRepository.findOne(id);
        if(id != -1) {
            injection.setBoarder(boarderRepository.findOne(idBoarder));
        }
        if(date != null)
            injection.setDate(date);
        if(dateStart != null)
            injection.setDateStart(dateStart);
        if(dateEnd != null)
            injection.setDateEnd(dateEnd);
        if(doctor != null)
            injection.setDoctor(doctor);
        if(establishment != null)
            injection.setEstablishment(establishment);
        if(nameMedic != null)
            injection.setNameMedic(nameMedic);
        if(dosage != -1)
            injection.setDosage(dosage);
        if(unit != null)
            injection.setUnit(unit);
        return new InjectionDto(injectionRepository.save(injection));
    }

}
