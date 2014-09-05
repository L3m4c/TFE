package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dams on 11/08/2014.
 */
@Entity
public class Aspect {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Boarder boarder;
    @ManyToOne
    private User user;
    private Date date = new Date();
    private boolean redness;
    private boolean fibrin;
    private boolean necrosis;
    private boolean pink;
    private String aspectOther;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isRedness() {
        return redness;
    }

    public void setRedness(boolean redness) {
        this.redness = redness;
    }

    public boolean isFibrin() {
        return fibrin;
    }

    public void setFibrin(boolean fibrin) {
        this.fibrin = fibrin;
    }

    public boolean isNecrosis() {
        return necrosis;
    }

    public void setNecrosis(boolean necrosis) {
        this.necrosis = necrosis;
    }

    public boolean isPink() {
        return pink;
    }

    public void setPink(boolean pink) {
        this.pink = pink;
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

    public String getAspectOther() {
        return aspectOther;
    }

    public void setAspectOther(String aspectOther) {
        this.aspectOther = aspectOther;
    }
}
