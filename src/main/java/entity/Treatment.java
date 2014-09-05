package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dams on 12/08/2014.
 */
@Entity
public class Treatment {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Boarder boarder;
    @ManyToOne
    private User user;
    private Date date = new Date();
    private boolean pst;
    private boolean irrigation;
    private boolean therapeuticBath;
    private int drillWidth;
    private int drillLength;
    private boolean debridement;
    private String treatmentOther;


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

    public boolean isPst() {
        return pst;
    }

    public void setPst(boolean pst) {
        this.pst = pst;
    }

    public boolean isIrrigation() {
        return irrigation;
    }

    public void setIrrigation(boolean irrigation) {
        this.irrigation = irrigation;
    }

    public boolean isTherapeuticBath() {
        return therapeuticBath;
    }

    public void setTherapeuticBath(boolean therapeuticBath) {
        this.therapeuticBath = therapeuticBath;
    }

    public int getDrillWidth() {
        return drillWidth;
    }

    public void setDrillWidth(int drillWidth) {
        this.drillWidth = drillWidth;
    }

    public int getDrillLength() {
        return drillLength;
    }

    public void setDrillLength(int drillLength) {
        this.drillLength = drillLength;
    }

    public boolean isDebridement() {
        return debridement;
    }

    public void setDebridement(boolean debridement) {
        this.debridement = debridement;
    }

    public String getTreatmentOther() {
        return treatmentOther;
    }

    public void setTreatmentOther(String treatmentOther) {
        this.treatmentOther = treatmentOther;
    }
}
