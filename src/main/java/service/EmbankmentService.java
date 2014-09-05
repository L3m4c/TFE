package service;

import dto.EmbankmentDto;
import entity.BoarderRepository;
import entity.Embankment;
import entity.EmbankmentRepository;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 12/08/2014.
 */
public class EmbankmentService {


    @Resource
    EmbankmentRepository embankmentRepository;
    @Resource
    BoarderRepository boarderRepository;
    @Autowired
    UserService userService;

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

    public EmbankmentDto save(long idBoarder, Date date, boolean regular, boolean irregular, boolean furrow, boolean detachment, boolean budding) {
        Embankment embankment = new Embankment();
        User current = userService.getCurrentUser();
        embankment.setBoarder(boarderRepository.findOne(idBoarder));
        embankment.setUser(current);

        if(date != null) {
            embankment.setDate(date);
        }
        embankment.setRegular(regular);
        embankment.setIrregular(irregular);
        embankment.setFurrow(furrow);
        embankment.setDetachment(detachment);
        embankment.setBudding(budding);


        return new EmbankmentDto(embankmentRepository.save(embankment));
    }

    public EmbankmentDto update(long id, long idBoarder, Date date, boolean regular, boolean irregular, boolean furrow, boolean detachment, boolean budding) {
        Embankment embankment = embankmentRepository.findOne(id);
        if(id != -1) {
            embankment.setBoarder(boarderRepository.findOne(idBoarder));
        }
        if(date != null)
            embankment.setDate(date);
        embankment.setRegular(regular);
        embankment.setIrregular(irregular);
        embankment.setFurrow(furrow);
        embankment.setDetachment(detachment);
        embankment.setBudding(budding);

        return new EmbankmentDto(embankmentRepository.save(embankment));
    }


}
