package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dams on 9/08/2014.
 */
@Entity
public class Eat {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Boarder boarder;
    @ManyToOne
    private User user;
    private Date date = new Date();
    private boolean priorAid;
    private boolean fullAid;
    private boolean eatStimulated;
    private boolean hydration;

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

    public boolean isPriorAid() {
        return priorAid;
    }

    public void setPriorAid(boolean priorAid) {
        this.priorAid = priorAid;
    }

    public boolean isFullAid() {
        return fullAid;
    }

    public void setFullAid(boolean fullAid) {
        this.fullAid = fullAid;
    }

    public boolean isEatStimulated() {
        return eatStimulated;
    }

    public void setEatStimulated(boolean eatStimulated) {
        this.eatStimulated = eatStimulated;
    }

    public boolean isHydration() {
        return hydration;
    }

    public void setHydration(boolean hydration) {
        this.hydration = hydration;
    }
}
