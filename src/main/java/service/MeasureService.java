package service;

import dto.MeasureDto;
import entity.BoarderRepository;
import entity.Measure;
import entity.MeasureRepository;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 11/08/2014.
 */
public class MeasureService {


    @Resource
    MeasureRepository measureRepository;
    @Resource
    BoarderRepository boarderRepository;
    @Autowired
    UserService userService;

    public List<MeasureDto> findAll() {
        Iterator i = measureRepository.findAll().iterator();
        List<MeasureDto> listMeasure = new ArrayList<MeasureDto>();
        while(i.hasNext()) {
            listMeasure.add(new MeasureDto((Measure)i.next()));
        }
        return listMeasure;
    }

    public MeasureDto findById(long id) {
        return new MeasureDto(measureRepository.findOne(id));
    }

    public void delete(long id) {
        measureRepository.delete(id);
    }

    public MeasureDto save(long idBoarder, Date date, int size, int depth, String quantity, String nature, boolean odor) {
        Measure measure = new Measure();
        User current = userService.getCurrentUser();
        measure.setBoarder(boarderRepository.findOne(idBoarder));
        measure.setUser(current);

        if(date != null) {
            measure.setDate(date);
        }
        measure.setSize(size);
        measure.setDepth(depth);
        measure.setQuantity(quantity);
        measure.setNature(nature);
        measure.setOdor(odor);

        return new MeasureDto(measureRepository.save(measure));
    }

    public MeasureDto update(long id, long idBoarder, Date date, int size, int depth, String quantity, String nature, boolean odor) {
        Measure measure = measureRepository.findOne(id);
        if(id != -1) {
            measure.setBoarder(boarderRepository.findOne(idBoarder));
        }
        if(date != null)
            measure.setDate(date);
        measure.setSize(size);
        measure.setDepth(depth);
        measure.setQuantity(quantity);
        measure.setNature(nature);
        measure.setOdor(odor);

        return new MeasureDto(measureRepository.save(measure));
    }




}
