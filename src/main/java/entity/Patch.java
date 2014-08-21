package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dams on 4/08/2014.
 */
@Entity
public class Patch {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Boarder boarder;

    @ManyToOne
    private User user;
    private Date date = new Date();
    private Date dateStart = new Date();
    private Date dateEnd = new Date();
    private String doctor;
    private String nameMedic;
    private int dosage;
    private String unit;

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

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {return dateEnd;   }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getNameMedic() {
        return nameMedic;
    }

    public void setNameMedic(String nameMedic) {
        this.nameMedic = nameMedic;
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }




}
