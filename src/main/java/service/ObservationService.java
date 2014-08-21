package service;

import dto.ObservationDto;
import entity.BoarderRepository;
import entity.Observation;
import entity.ObservationRepository;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 6/08/2014.
 */
public class ObservationService {

    @Resource
    ObservationRepository observationRepository;
    @Resource
    BoarderRepository boarderRepository;
    @Autowired
    UserService userService;

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

    public ObservationDto save(long idBoarder, Date date, String comment) {
        Observation observation = new Observation();
        User current = userService.getCurrentUser();
        observation.setBoarder(boarderRepository.findOne(idBoarder));
        observation.setUser(current);
        if(date != null) {
            observation.setDate(date);
        }
        observation.setComment(comment);
        return new ObservationDto(observationRepository.save(observation));
    }

    public ObservationDto update(long id, long idBoarder, Date date, String comment) {
        Observation observation = observationRepository.findOne(id);
        observation.setBoarder(boarderRepository.findOne(idBoarder));
        if(date != null) {
            observation.setDate(date);
        }
        if(comment != null)
            observation.setComment(comment);
        return new ObservationDto(observationRepository.save(observation));
    }

}
