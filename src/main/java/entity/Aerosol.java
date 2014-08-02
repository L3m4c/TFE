package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dams on 12/07/2014.
 */
@Entity
public class Aerosol {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Boarder boarder;

    @ManyToOne
    private User user;

    private long time1;

    private Date date = new Date();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Boarder getBoarder() {
        return boarder;
    }

    public void setBoarder(Boarder boarder) {
        this.boarder = boarder;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getTime1() {return time1;}

    public void setTime1 (long time1) {this.time1 = time1;}

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
