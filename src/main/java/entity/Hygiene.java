package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dams on 8/08/2014.
 */
@Entity
public class Hygiene {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Boarder boarder;
    @ManyToOne
    private User user;
    private Date date = new Date();
    private boolean toiletPartiel;
    private boolean toiletComplete;
    private boolean hygieneStimulated;
    private boolean bath;

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

    public boolean isToiletPartiel() {
        return toiletPartiel;
    }

    public void setToiletPartiel(boolean toiletPartiel) {
        this.toiletPartiel = toiletPartiel;
    }

    public boolean isToiletComplete() {
        return toiletComplete;
    }

    public void setToiletComplete(boolean toiletComplete) {
        this.toiletComplete = toiletComplete;
    }

    public boolean isHygieneStimulated() {
        return hygieneStimulated;
    }

    public void setHygieneStimulated(boolean hygieneStimulated) {
        this.hygieneStimulated = hygieneStimulated;
    }

    public boolean isBath() {
        return bath;
    }

    public void setBath(boolean bath) {
        this.bath = bath;
    }
}
