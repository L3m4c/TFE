package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dams on 9/08/2014.
 */
@Entity
public class Mobilization {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Boarder boarder;
    @ManyToOne
    private User user;
    private Date date = new Date();
    private boolean help;
    private boolean material;
    private boolean cane;

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

    public boolean isHelp() {
        return help;
    }

    public void setHelp(boolean help) {
        this.help = help;
    }

    public boolean isMaterial() {
        return material;
    }

    public void setMaterial(boolean material) {
        this.material = material;
    }

    public boolean isCane() {
        return cane;
    }

    public void setCane(boolean cane) {
        this.cane = cane;
    }
}
