package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dams on 12/08/2014.
 */
@Entity
public class Embankment {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Boarder boarder;
    @ManyToOne
    private User user;
    private Date date = new Date();
    private boolean regular;
    private boolean irregular;
    private boolean furrow;
    private boolean detachment;
    private boolean budding;

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

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    public boolean isIrregular() {
        return irregular;
    }

    public void setIrregular(boolean irregular) {
        this.irregular = irregular;
    }

    public boolean isFurrow() {
        return furrow;
    }

    public void setFurrow(boolean furrow) {
        this.furrow = furrow;
    }

    public boolean isDetachment() {
        return detachment;
    }

    public void setDetachment(boolean detachment) {
        this.detachment = detachment;
    }

    public boolean isBudding() {
        return budding;
    }

    public void setBudding(boolean budding) {
        this.budding = budding;
    }
}
