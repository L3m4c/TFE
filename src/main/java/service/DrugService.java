package service;

import dto.DrugDto;
import entity.Drug;
import entity.DrugRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 2/08/2014.
 */
public class DrugService {

    @Resource
    DrugRepository drugRepository;

    public List<DrugDto> findAll() {
        Iterator i = drugRepository.findAll().iterator();
        List<DrugDto> listDrug = new ArrayList<DrugDto>();
        while(i.hasNext()) {
            listDrug.add(new DrugDto((Drug)i.next()));
        }
        return listDrug;
    }

    public DrugDto findById(long id) {
        return new DrugDto(drugRepository.findOne(id));
    }

    public void delete(long id) {
        drugRepository.delete(id);
    }

    public DrugDto save(String name, int dosage, String unit) {
        Drug drug = new Drug();
        drug.setDosage(dosage);
        drug.setName(name);
        drug.setUnit(unit);
        return new DrugDto(drugRepository.save(drug));
    }

    public DrugDto update(long id, String name, int dosage, String unit ) {
        Drug drug = drugRepository.findOne(id);

        if(name != null)
            drug.setName(name);
        if(dosage != -1)
            drug.setDosage(dosage);
        if(unit != null)
            drug.setUnit(unit);
        return new DrugDto(drugRepository.save(drug));
    }

}
