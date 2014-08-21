package dto;

import entity.Therapeutic;

import java.util.Date;

/**
 * Created by Dams on 8/08/2014.
 */
public class TherapeuticDto {
    private long id;
    private BoarderDto boarder;
    private UserDto user;
    private Date date;
    private boolean preparation;
    private boolean adMorning;
    private boolean adMidday;
    private boolean adEvening;
    private boolean adNight;

    public TherapeuticDto() {}

    public TherapeuticDto(Therapeutic therapeutic) {
        this.id = therapeutic.getId();
        if(therapeutic.getBoarder() != null)
            this.boarder = new BoarderDto(therapeutic.getBoarder());
        if(therapeutic.getUser() != null)
            this.user = new UserDto(therapeutic.getUser());
        this.date = therapeutic.getDate();
        this.preparation = therapeutic.isPreparation();
        this.adMorning = therapeutic.isAdMorning();
        this.adMidday = therapeutic.isAdMidday();
        this.adEvening = therapeutic.isAdEvening();
        this.adNight = therapeutic.isAdNight();
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

    public boolean isPreparation() {
        return preparation;
    }

    public void setPreparation(boolean preparation) {
        this.preparation = preparation;
    }

    public boolean isAdMorning() {
        return adMorning;
    }

    public void setAdMorning(boolean adMorning) {
        this.adMorning = adMorning;
    }

    public boolean isAdMidday() {
        return adMidday;
    }

    public void setAdMidday(boolean adMidday) {
        this.adMidday = adMidday;
    }

    public boolean isAdEvening() {
        return adEvening;
    }

    public void setAdEvening(boolean adEvening) {
        this.adEvening = adEvening;
    }

    public boolean isAdNight() {
        return adNight;
    }

    public void setAdNight(boolean adNight) {
        this.adNight = adNight;
    }
}
