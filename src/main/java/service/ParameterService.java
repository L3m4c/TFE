package service;

import dto.ParameterDto;
import entity.Parameter;
import entity.ParameterRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 9/08/2014.
 */
public class ParameterService {

    @Resource
    ParameterRepository parameterRepository;

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

    public ParameterDto save(int pulse, int tension, int temperature) {
        Parameter parameter = new Parameter();
        parameter.setPulse(pulse);
        parameter.setTension(tension);
        parameter.setTemperature(temperature);
        return new ParameterDto(parameterRepository.save(parameter));
    }

    public ParameterDto update(long id, int pulse, int tension, int temperature ) {
        Parameter parameter = parameterRepository.findOne(id);

        if(pulse != -1)
            parameter.setPulse(pulse);
        if(tension != -1)
            parameter.setTension(tension);
        if(temperature != -1)
            parameter.setTemperature(temperature);
        return new ParameterDto(parameterRepository.save(parameter));
    }



}
