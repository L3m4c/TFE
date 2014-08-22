package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dams on 9/08/2014.
 */
@Entity
public class Incontinence {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Boarder boarder;
    @ManyToOne
    private User user;
    private Date date = new Date();
    private boolean diurnal;
    private boolean nocturnal;
    private boolean both;

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
