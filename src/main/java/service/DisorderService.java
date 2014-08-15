package service;

import dto.DisorderDto;
import entity.Disorder;
import entity.DisorderRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 9/08/2014.
 */
public class DisorderService {


    @Resource
    DisorderRepository disorderRepository;

    public List<DisorderDto> findAll() {
        Iterator i = disorderRepository.findAll().iterator();
        List<DisorderDto> listDisorder = new ArrayList<DisorderDto>();
        while(i.hasNext()) {
            listDisorder.add(new DisorderDto((Disorder)i.next()));
        }
        return listDisorder;
    }

    public DisorderDto findById(long id) {
        return new DisorderDto(disorderRepository.findOne(id));
    }

    public void delete(long id) {
        disorderRepository.delete(id);
    }

    public DisorderDto save(boolean timeDisorientation, boolean spaceDisorientation, boolean termDifficulty, boolean verbalDifficulty, boolean lossConcept, boolean agitated) {
        Disorder disorder = new Disorder();
        disorder.setTimeDisorientation(timeDisorientation);
        disorder.setSpaceDisorientation(spaceDisorientation);
        disorder.setTermDifficulty(termDifficulty);
        disorder.setVerbalDifficulty(verbalDifficulty);
        disorder.setLossConcept(lossConcept);
        disorder.setAgitated(agitated);

        return new DisorderDto(disorderRepository.save(disorder));
    }

    public DisorderDto update(long id, boolean timeDisorientation, boolean spaceDisorientation, boolean termDifficulty, boolean verbalDifficulty, boolean lossConcept, boolean agitated) {
        Disorder disorder = disorderRepository.findOne(id);

        disorder.setTimeDisorientation(timeDisorientation);
        disorder.setSpaceDisorientation(spaceDisorientation);
        disorder.setTermDifficulty(termDifficulty);
        disorder.setVerbalDifficulty(verbalDifficulty);
        disorder.setLossConcept(lossConcept);
        disorder.setAgitated(agitated);

        return new DisorderDto(disorderRepository.save(disorder));
    }



}
