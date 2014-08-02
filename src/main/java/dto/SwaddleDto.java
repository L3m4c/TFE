package dto;

import entity.Swaddle;
import java.util.Date;

/**
 * Created by Dams on 1/07/2014.
 */
public class SwaddleDto {
    private long id;
    private long boarder;
    private long user;
    private Date date;

    public SwaddleDto() {}

    public SwaddleDto(Swaddle swaddle) {
        this.id = swaddle.getId();
        if(swaddle.getBoarder() != null)
            this.boarder = swaddle.getBoarder().getId();
        if(swaddle.getUser() != null)
            this.user = swaddle.getUser().getId();
        this.date = swaddle.getDate();
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
