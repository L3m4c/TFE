package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dams on 6/08/2014.
 */
@Entity
public class InsulinTaking {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Boarder boarder;

    @ManyToOne
    private User user;

    private Date date = new Date();
    private int glycemia;

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
