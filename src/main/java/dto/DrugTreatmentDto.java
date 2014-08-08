package dto;

import entity.DrugTreatment;

import java.util.Date;

/**
 * Created by Dams on 7/08/2014.
 */
public class DrugTreatmentDto {

    private long id;
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

    public DrugTreatmentDto() {}

    public DrugTreatmentDto(DrugTreatment drugTreatment) {
        this.id = drugTreatment.getId();
        this.dateStart = drugTreatment.getDateStart();
        this.dateEnd = drugTreatment.getDateEnd();
        this.doctor = drugTreatment.getDoctor();
        this.nameMedic = drugTreatment.getNameMedic();
        this.dosage = drugTreatment.getDosage();
        this.unit = drugTreatment.getUnit();
        this.morning = drugTreatment.getMorning();
        this.midday = drugTreatment.getMidday();
        this.evening = drugTreatment.getEvening();
        this.night = drugTreatment.getNight();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
