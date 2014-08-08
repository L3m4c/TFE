package dto;

import entity.Injection;

import java.util.Date;

/**
 * Created by Dams on 5/08/2014.
 */
public class InjectionDto {

    private long id;
    private String boarder;
    private String user;
    private Date date = new Date();
    private Date dateStart;
    private Date dateEnd;
    private String doctor;
    private String establishment;
    private String nameMedic;
    private int dosage;
    private String unit;

    public InjectionDto() {}

    public InjectionDto(Injection injection) {
        this.id = injection.getId();
        this.boarder = injection.getBoarder();
        this.user = injection.getUser();
        this.date = injection.getDate();
        this.dateStart = injection.getDateStart();
        this.dateEnd = injection.getDateEnd();
        this.doctor = injection.getDoctor();
        this.establishment = injection.getEstablishment();
        this.nameMedic = injection.getNameMedic();
        this.dosage = injection.getDosage();
        this.unit = injection.getUnit();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBoarder() {
        return boarder;
    }

    public void setBoarder(String boarder) {
        this.boarder = boarder;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
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

    public String getEstablishment() {
        return establishment;
    }

    public void setEstablishment(String establishment) {
        this.establishment = establishment;
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
