package dto;

import entity.Patch;

import java.util.Date;

/**
 * Created by Dams on 4/08/2014.
 */
public class PatchDto {

    private long id;
    private Date date = new Date();
    private Date dateStart;
    private Date dateEnd;
    private String doctor;
    private String nameMedic;
    private int dosage;
    private String unit;

    public PatchDto() {}

    public PatchDto(Patch patch) {
        this.id = patch.getId();
        this.date = patch.getDate();
        this.dateStart = patch.getDateStart();
        this.dateEnd = patch.getDateEnd();
        this.doctor = patch.getDoctor();
        this.nameMedic = patch.getNameMedic();
        this.dosage = patch.getDosage();
        this.unit = patch.getUnit();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
}
