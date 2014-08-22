package dto;

import entity.Incontinence;

import java.util.Date;

/**
 * Created by Dams on 9/08/2014.
 */
public class IncontinenceDto {

    private long id;
    private BoarderDto boarder;
    private UserDto user;
    private Date date;
    private boolean diurnal;
    private boolean nocturnal;
    private boolean both;

    public IncontinenceDto() {}

    public IncontinenceDto(Incontinence incontinence) {
        this.id = incontinence.getId();
        if(incontinence.getBoarder() != null)
            this.boarder = new BoarderDto(incontinence.getBoarder());
        if(incontinence.getUser() != null)
            this.user = new UserDto(incontinence.getUser());
        this.date = incontinence.getDate();
        this.diurnal = incontinence.isDiurnal();
        this.nocturnal = incontinence.isNocturnal();
        this.both = incontinence.isBoth();
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

    public boolean isDiurnal() {
        return diurnal;
    }

    public void setDiurnal(boolean diurnal) {
        this.diurnal = diurnal;
    }

    public boolean isNocturnal() {
        return nocturnal;
    }

    public void setNocturnal(boolean nocturnal) {
        this.nocturnal = nocturnal;
    }

    public boolean isBoth() {
        return both;
    }

    public void setBoth(boolean both) {
        this.both = both;
    }
}
