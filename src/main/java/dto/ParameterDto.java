package dto;

import entity.Parameter;

/**
 * Created by Dams on 9/08/2014.
 */
public class ParameterDto {

    private long id;
    private int pulse;
    private int tension;
    private int temperature;


    public ParameterDto() {}

    public ParameterDto(Parameter parameter) {
        this.id = parameter.getId();
        this.pulse = parameter.getPulse();
        this.tension = parameter.getTension();
        this.temperature = parameter.getTemperature();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getTension() {
        return tension;
    }

    public void setTension(int tension) {
        this.tension = tension;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
