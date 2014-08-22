package dto;

import entity.Parameter;

import java.util.Date;

/**
 * Created by Dams on 9/08/2014.
 */
public class ParameterDto {

    private long id;
    private BoarderDto boarder;
    private UserDto user;
    private Date date;
    private int pulse;
    private int tension;
    private int temperature;


    public ParameterDto() {}

    public ParameterDto(Parameter parameter) {
        this.id = parameter.getId();
        if(parameter.getBoarder() != null)
            this.boarder = new BoarderDto(parameter.getBoarder());
        if(parameter.getUser() != null)
            this.user = new UserDto(parameter.getUser());
        this.date = parameter.getDate();
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

    public BoarderDto getBoarder() {
        return boarder;
    }

    public void setBoarder(BoarderDto boarder) {
        this.boarder = boarder;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
