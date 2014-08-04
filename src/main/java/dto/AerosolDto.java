package dto;

import entity.Aerosol;

import java.util.Date;

/**
 * Created by Dams on 12/07/2014.
 */
public class AerosolDto {

    private long id;
    private long time1;
    private Date date;
    private String nameMedic;
    private int dosage;
    private String unit;

    public AerosolDto() {}

    public AerosolDto(Aerosol aerosol) {
        this.id = aerosol.getId();
        this.date = aerosol.getDate();
        this.nameMedic = aerosol.getNameMedic();
        this.dosage = aerosol.getDosage();
        this.unit = aerosol.getUnit();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTime1() {
        return time1;
    }

    public void setTime1(long time1) {
        this.time1 = time1;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNameMedic() {
        return nameMedic;
    }

    public void setNameMedic(String nameMedic) {this.nameMedic = nameMedic;}

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
