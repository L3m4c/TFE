package dto;

import entity.Aerosol;

import java.util.Date;

/**
 * Created by Dams on 12/07/2014.
 */
public class AerosolDto {

    private long id;
    private long boarder;
    private long user;
    private long time1;
    private Date date;

    public AerosolDto() {}

    public AerosolDto(Aerosol aerosol) {
        this.id = aerosol.getId();
        if(aerosol.getBoarder() != null)
            this.boarder = aerosol.getBoarder().getId();
        if(aerosol.getUser() != null)
            this.user = aerosol.getUser().getId();
        this.date = aerosol.getDate();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBoarder() {
        return boarder;
    }

    public void setBoarder(long boarder) {
        this.boarder = boarder;
    }

    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }

    public long getTime1() {
        return time1;
    }

    public void setTime1(long time1) {
        this.time1 = time1;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
