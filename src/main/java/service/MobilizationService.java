package service;

import dto.MobilizationDto;
import entity.Mobilization;
import entity.MobilizationRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 9/08/2014.
 */
public class MobilizationService {

    @Resource
    MobilizationRepository mobilizationRepository;

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

    public MobilizationDto save(boolean help, boolean material, boolean cane) {
        Mobilization mobilization = new Mobilization();
        mobilization.setHelp(help);
        mobilization.setMaterial(material);
        mobilization.setCane(cane);

        return new MobilizationDto(mobilizationRepository.save(mobilization));
    }

    public MobilizationDto update(long id, boolean help, boolean material, boolean cane) {
        Mobilization mobilization = mobilizationRepository.findOne(id);

        mobilization.setHelp(help);
        mobilization.setMaterial(material);
        mobilization.setCane(cane);

        return new MobilizationDto(mobilizationRepository.save(mobilization));
    }




}
