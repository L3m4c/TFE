package dto;

import entity.Aspect;

import java.util.Date;

/**
 * Created by Dams on 11/08/2014.
 */
public class AspectDto {

    private long id;
    private BoarderDto boarder;
    private UserDto user;
    private Date date;
    private boolean redness;
    private boolean fibrin;
    private boolean necrosis;
    private boolean pink;
    private String aspectOther;


    public AspectDto() {}

    public AspectDto(Aspect aspect) {
        this.id = aspect.getId();
        if(aspect.getBoarder() != null)
            this.boarder = new BoarderDto(aspect.getBoarder());
        if(aspect.getUser() != null)
            this.user = new UserDto(aspect.getUser());
        this.date = aspect.getDate();
        this.redness = aspect.isRedness();
        this.fibrin = aspect.isFibrin();
        this.necrosis = aspect.isNecrosis();
        this.pink = aspect.isPink();
        this.aspectOther = aspect.getAspectOther();
            }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isRedness() {
        return redness;
    }

    public void setRedness(boolean redness) {
        this.redness = redness;
    }

    public boolean isFibrin() {
        return fibrin;
    }

    public void setFibrin(boolean fibrin) {
        this.fibrin = fibrin;
    }

    public boolean isNecrosis() {
        return necrosis;
    }

    public void setNecrosis(boolean necrosis) {
        this.necrosis = necrosis;
    }

    public boolean isPink() {
        return pink;
    }

    public void setPink(boolean pink) {
        this.pink = pink;
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

    public String getAspectOther() {
        return aspectOther;
    }

    public void setAspectOther(String aspectOther) {
        this.aspectOther = aspectOther;
    }
}
