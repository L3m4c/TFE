package dto;

import entity.Embankment;

import java.util.Date;

/**
 * Created by Dams on 12/08/2014.
 */
public class EmbankmentDto {


    private long id;
    private BoarderDto boarder;
    private UserDto user;
    private Date date;
    private boolean regular;
    private boolean irregular;
    private boolean furrow;
    private boolean detachment;
    private boolean budding;

    public EmbankmentDto() {}

    public EmbankmentDto(Embankment embankment) {
        this.id = embankment.getId();
        if(embankment.getBoarder() != null)
            this.boarder = new BoarderDto(embankment.getBoarder());
        if(embankment.getUser() != null)
            this.user = new UserDto(embankment.getUser());
        this.date = embankment.getDate();
        this.regular = embankment.isRegular();
        this.irregular = embankment.isIrregular();
        this.furrow = embankment.isFurrow();
        this.detachment = embankment.isDetachment();
        this.budding = embankment.isBudding();

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

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    public boolean isIrregular() {
        return irregular;
    }

    public void setIrregular(boolean irregular) {
        this.irregular = irregular;
    }

    public boolean isFurrow() {
        return furrow;
    }

    public void setFurrow(boolean furrow) {
        this.furrow = furrow;
    }

    public boolean isDetachment() {
        return detachment;
    }

    public void setDetachment(boolean detachment) {
        this.detachment = detachment;
    }

    public boolean isBudding() {
        return budding;
    }

    public void setBudding(boolean budding) {
        this.budding = budding;
    }
}
