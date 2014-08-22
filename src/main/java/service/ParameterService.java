package service;

import dto.ParameterDto;
import entity.BoarderRepository;
import entity.Parameter;
import entity.ParameterRepository;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 9/08/2014.
 */
public class ParameterService {

    @Resource
    ParameterRepository parameterRepository;
    @Resource
    BoarderRepository boarderRepository;
    @Autowired
    UserService userService;

    public List<ParameterDto> findAll() {
        Iterator i = parameterRepository.findAll().iterator();
        List<ParameterDto> listParameter = new ArrayList<ParameterDto>();
        while(i.hasNext()) {
            listParameter.add(new ParameterDto((Parameter)i.next()));
        }
        return listParameter;
    }

    public ParameterDto findById(long id) {
        return new ParameterDto(parameterRepository.findOne(id));
    }

    public void delete(long id) {
        parameterRepository.delete(id);
    }

    public ParameterDto save(long idBoarder, Date date, int pulse, int tension, int temperature) {
        Parameter parameter = new Parameter();
        User current = userService.getCurrentUser();
        parameter.setBoarder(boarderRepository.findOne(idBoarder));
        parameter.setUser(current);

        if(date != null) {
            parameter.setDate(date);
        }
        parameter.setPulse(pulse);
        parameter.setTension(tension);
        parameter.setTemperature(temperature);
        return new ParameterDto(parameterRepository.save(parameter));
    }

    public ParameterDto update(long id, long idBoarder, Date date, int pulse, int tension, int temperature ) {
        Parameter parameter = parameterRepository.findOne(id);
        if(id != -1) {
            parameter.setBoarder(boarderRepository.findOne(idBoarder));
        }
        if(date != null)
            parameter.setDate(date);
        if(pulse != -1)
            parameter.setPulse(pulse);
        if(tension != -1)
            parameter.setTension(tension);
        if(temperature != -1)
            parameter.setTemperature(temperature);
        return new ParameterDto(parameterRepository.save(parameter));
    }



}
