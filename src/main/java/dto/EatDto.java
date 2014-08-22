package dto;

import entity.Eat;

import java.util.Date;

/**
 * Created by Dams on 9/08/2014.
 */
public class EatDto {

    private long id;
    private BoarderDto boarder;
    private UserDto user;
    private Date date;
    private boolean priorAid;
    private boolean fullAid;
    private boolean stimulated;
    private boolean hydration;

    public EatDto() {}

    public EatDto(Eat eat) {
        this.id = eat.getId();
        if(eat.getBoarder() != null)
            this.boarder = new BoarderDto(eat.getBoarder());
        if(eat.getUser() != null)
            this.user = new UserDto(eat.getUser());
        this.date = eat.getDate();
        this.priorAid = eat.isPriorAid();
        this.fullAid = eat.isFullAid();
        this.stimulated = eat.isStimulated();
        this.hydration = eat.isHydration();
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

    public boolean isPriorAid() {
        return priorAid;
    }

    public void setPriorAid(boolean priorAid) {
        this.priorAid = priorAid;
    }

    public boolean isFullAid() {
        return fullAid;
    }

    public void setFullAid(boolean fullAid) {
        this.fullAid = fullAid;
    }

    public boolean isStimulated() {
        return stimulated;
    }

    public void setStimulated(boolean stimulated) {
        this.stimulated = stimulated;
    }

    public boolean isHydration() {
        return hydration;
    }

    public void setHydration(boolean hydration) {
        this.hydration = hydration;
    }
}
