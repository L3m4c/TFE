package service;

import dto.HygieneDto;
import entity.Hygiene;
import entity.HygieneRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 8/08/2014.
 */
public class HygieneService {

    @Resource
    HygieneRepository hygieneRepository;

    public List<HygieneDto> findAll() {
        Iterator i = hygieneRepository.findAll().iterator();
        List<HygieneDto> listHygiene = new ArrayList<HygieneDto>();
        while(i.hasNext()) {
            listHygiene.add(new HygieneDto((Hygiene)i.next()));
        }
        return listHygiene;
    }

    public HygieneDto findById(long id) {
        return new HygieneDto(hygieneRepository.findOne(id));
    }

    public void delete(long id) {
        hygieneRepository.delete(id);
    }

    public HygieneDto save(boolean toiletPartiel, boolean toiletComplete, boolean stimulated, boolean bath) {
        Hygiene hygiene = new Hygiene();
        hygiene.setToiletPartiel(toiletPartiel);
        hygiene.setToiletComplete(toiletComplete);
        hygiene.setStimulated(stimulated);
        hygiene.setBath(bath);


        return new HygieneDto(hygieneRepository.save(hygiene));
    }

    public HygieneDto update(long id, boolean toiletPartiel, boolean toiletComplete, boolean stimulated, boolean bath) {
        Hygiene hygiene = hygieneRepository.findOne(id);


        hygiene.setToiletPartiel(toiletPartiel);
        hygiene.setToiletComplete(toiletComplete);
        hygiene.setStimulated(stimulated);
        hygiene.setBath(bath);

        return new HygieneDto(hygieneRepository.save(hygiene));
    }

}
