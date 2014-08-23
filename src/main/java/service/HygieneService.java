package service;

import dto.HygieneDto;
import entity.BoarderRepository;
import entity.Hygiene;
import entity.HygieneRepository;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 8/08/2014.
 */
public class HygieneService {

    @Resource
    HygieneRepository hygieneRepository;
    @Resource
    BoarderRepository boarderRepository;
    @Autowired
    UserService userService;

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

    public HygieneDto save(long idBoarder, Date date, boolean toiletPartiel, boolean toiletComplete, boolean hygieneStimulated, boolean bath) {
        Hygiene hygiene = new Hygiene();
        User current = userService.getCurrentUser();
        hygiene.setBoarder(boarderRepository.findOne(idBoarder));
        hygiene.setUser(current);

        if(date != null) {
            hygiene.setDate(date);
        }
        hygiene.setToiletPartiel(toiletPartiel);
        hygiene.setToiletComplete(toiletComplete);
        hygiene.setHygieneStimulated(hygieneStimulated);
        hygiene.setBath(bath);


        return new HygieneDto(hygieneRepository.save(hygiene));
    }

    public HygieneDto update(long id, long idBoarder, Date date, boolean toiletPartiel, boolean toiletComplete, boolean hygieneStimulated, boolean bath) {
        Hygiene hygiene = hygieneRepository.findOne(id);
        if(id != -1) {
            hygiene.setBoarder(boarderRepository.findOne(idBoarder));
        }
        if(date != null)
            hygiene.setDate(date);

        hygiene.setToiletPartiel(toiletPartiel);
        hygiene.setToiletComplete(toiletComplete);
        hygiene.setHygieneStimulated(hygieneStimulated);
        hygiene.setBath(bath);

        return new HygieneDto(hygieneRepository.save(hygiene));
    }

}
