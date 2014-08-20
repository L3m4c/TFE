package dto;

import entity.InsulinTaking;

import java.util.Date;

/**
 * Created by Dams on 6/08/2014.
 */
public class InsulinTakingDto {

    private long id;
    private BoarderDto boarder;
    private UserDto user;
    private Date date;
    private int glycemia;

    public InsulinTakingDto() {}

    public InsulinTakingDto(InsulinTaking insulinTaking) {
        this.id = insulinTaking.getId();
        if(insulinTaking.getBoarder() != null)
            this.boarder = new BoarderDto(insulinTaking.getBoarder());
        if(insulinTaking.getUser() != null)
            this.user = new UserDto(insulinTaking.getUser());
        this.date = insulinTaking.getDate();
        this.glycemia = insulinTaking.getGlycemia();

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

    public int getGlycemia() {
        return glycemia;
    }

    public void setGlycemia(int glycemia) {
        this.glycemia = glycemia;
    }
}
