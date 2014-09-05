package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dams on 12/08/2014.
 */
@Entity
public class SurroundingSkin {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Boarder boarder;
    @ManyToOne
    private User user;
    private Date date = new Date();
    private boolean healthy;
    private boolean fragile;
    private boolean dry;
    private boolean hyperpigmented;
    private boolean hyperkeration;
    private boolean inflammatory;
    private boolean macerated;
    private boolean ulcerated;


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

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    public boolean isDry() {
        return dry;
    }

    public void setDry(boolean dry) {
        this.dry = dry;
    }

    public boolean isHyperpigmented() {
        return hyperpigmented;
    }

    public void setHyperpigmented(boolean hyperpigmented) {
        this.hyperpigmented = hyperpigmented;
    }

    public boolean isHyperkeration() {
        return hyperkeration;
    }

    public void setHyperkeration(boolean hyperkeration) {
        this.hyperkeration = hyperkeration;
    }

    public boolean isInflammatory() {
        return inflammatory;
    }

    public void setInflammatory(boolean inflammatory) {
        this.inflammatory = inflammatory;
    }

    public boolean isMacerated() {
        return macerated;
    }

    public void setMacerated(boolean macerated) {
        this.macerated = macerated;
    }

    public boolean isUlcerated() {
        return ulcerated;
    }

    public void setUlcerated(boolean ulcerated) {
        this.ulcerated = ulcerated;
    }
}
