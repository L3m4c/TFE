package service;

import dto.EmbankmentDto;
import entity.Embankment;
import entity.EmbankmentRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 12/08/2014.
 */
public class EmbankmentService {


    @Resource
    EmbankmentRepository embankmentRepository;

    public List<EmbankmentDto> findAll() {
        Iterator i = embankmentRepository.findAll().iterator();
        List<EmbankmentDto> listEmbankment = new ArrayList<EmbankmentDto>();
        while(i.hasNext()) {
            listEmbankment.add(new EmbankmentDto((Embankment)i.next()));
        }
        return listEmbankment;
    }

    public EmbankmentDto findById(long id) {
        return new EmbankmentDto(embankmentRepository.findOne(id));
    }

    public void delete(long id) {
        embankmentRepository.delete(id);
    }

    public EmbankmentDto save(boolean regular, boolean irregular, boolean furrow, boolean detachment, boolean budding) {
        Embankment embankment = new Embankment();
        embankment.setRegular(regular);
        embankment.setIrregular(irregular);
        embankment.setFurrow(furrow);
        embankment.setDetachment(detachment);
        embankment.setBudding(budding);


        return new EmbankmentDto(embankmentRepository.save(embankment));
    }

    public EmbankmentDto update(long id, boolean regular, boolean irregular, boolean furrow, boolean detachment, boolean budding) {
        Embankment embankment = embankmentRepository.findOne(id);

        embankment.setRegular(regular);
        embankment.setIrregular(irregular);
        embankment.setFurrow(furrow);
        embankment.setDetachment(detachment);
        embankment.setBudding(budding);

        return new EmbankmentDto(embankmentRepository.save(embankment));
    }


}
