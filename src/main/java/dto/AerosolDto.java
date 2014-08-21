package dto;

import entity.Aerosol;

import java.util.Date;

/**
 * Created by Dams on 12/07/2014.
 */
public class AerosolDto {

    private long id;
    private BoarderDto boarder;
    private UserDto user;
    private Date date;
    private Date dateStart;
    private Date dateEnd;
    private String doctor;
    private String nameMedic;
    private int dosage;
    private String unit;

    public AerosolDto() {}

    public AerosolDto(Aerosol aerosol) {
        this.id = aerosol.getId();
        if(aerosol.getBoarder() != null)
            this.boarder = new BoarderDto(aerosol.getBoarder());
        if(aerosol.getUser() != null)
            this.user = new UserDto(aerosol.getUser());

        this.date = aerosol.getDate();
        this.dateStart = aerosol.getDateStart();
        this.dateEnd = aerosol.getDateEnd();
        this.doctor = aerosol.getDoctor();
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

    public BoarderDto getBoarder() {
        return boarder;
    }

    public void setBoarder(BoarderDto boarder) {
        this.boarder = boarder;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
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
}
