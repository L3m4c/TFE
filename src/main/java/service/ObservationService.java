package service;

import dto.ObservationDto;
import entity.Observation;
import entity.ObservationRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 6/08/2014.
 */
public class ObservationService {

    @Resource
    ObservationRepository observationRepository;

    public List<ObservationDto> findAll() {
        Iterator i = observationRepository.findAll().iterator();
        List<ObservationDto> listObservation = new ArrayList<ObservationDto>();
        while(i.hasNext()) {
            listObservation.add(new ObservationDto((Observation) i.next()));
        }
        return listObservation;
    }

    public ObservationDto findById(long id) {
        return new ObservationDto(observationRepository.findOne(id));
    }

    public void delete(long id) {
        observationRepository.delete(id);
    }

    public ObservationDto save( String comment) {
        Observation observation = new Observation();
        observation.setComment(comment);
        return new ObservationDto(observationRepository.save(observation));
    }

    public ObservationDto update(long id, String comment ) {
        Observation observation = observationRepository.findOne(id);
        if(comment != null)
            observation.setComment(comment);
        return new ObservationDto(observationRepository.save(observation));
    }

}
