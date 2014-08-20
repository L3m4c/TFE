package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dams on 6/08/2014.
 */
@Entity
public class InsulinDosage {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Boarder boarder;
    @ManyToOne
    private User user;
    private Date date = new Date();
    private int dosage;

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
