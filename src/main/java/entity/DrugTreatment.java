package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Dams on 7/08/2014.
 */
@Entity
public class DrugTreatment {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Boarder boarder;
    @ManyToOne
    private User user;
    private Date date = new Date();
    private Date dateStart;
    private Date dateEnd;
    private String doctor;
    private String nameMedic;
    private int dosage;
    private String unit;
    private int morning;
    private int midday;
    private int evening;
    private int night;

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

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
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

    public int getMorning() {
        return morning;
    }

    public void setMorning(int morning) {
        this.morning = morning;
    }

    public int getMidday() {
        return midday;
    }

    public void setMidday(int midday) {
        this.midday = midday;
    }

    public int getEvening() {
        return evening;
    }

    public void setEvening(int evening) {
        this.evening = evening;
    }

    public int getNight() {
        return night;
    }

    public void setNight(int night) {
        this.night = night;
    }
}
