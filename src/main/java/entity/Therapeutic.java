package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dams on 8/08/2014.
 */
@Entity
public class Therapeutic {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Boarder boarder;
    @ManyToOne
    private User user;
    private Date date = new Date();
    private boolean preparation;
    private boolean adMorning;
    private boolean adMidday;
    private boolean adEvening;
    private boolean adNight;

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

    public boolean isPreparation() {
        return preparation;
    }

    public void setPreparation(boolean preparation) {
        this.preparation = preparation;
    }

    public boolean isAdMorning() {
        return adMorning;
    }

    public void setAdMorning(boolean adMorning) {
        this.adMorning = adMorning;
    }

    public boolean isAdMidday() {
        return adMidday;
    }

    public void setAdMidday(boolean adMidday) {
        this.adMidday = adMidday;
    }

    public boolean isAdEvening() {
        return adEvening;
    }

    public void setAdEvening(boolean adEvening) {
        this.adEvening = adEvening;
    }

    public boolean isAdNight() {
        return adNight;
    }

    public void setAdNight(boolean adNight) {
        this.adNight = adNight;
    }
}
