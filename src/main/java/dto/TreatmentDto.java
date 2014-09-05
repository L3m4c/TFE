package dto;

import entity.Treatment;

import java.util.Date;

/**
 * Created by Dams on 12/08/2014.
 */
public class TreatmentDto {

    private long id;
    private BoarderDto boarder;
    private UserDto user;
    private Date date;
    private boolean pst;
    private boolean irrigation;
    private boolean therapeuticBath;
    private int drillWidth;
    private int drillLength;
    private boolean debridement;
    private String treatmentOther;

    public TreatmentDto() {}

    public TreatmentDto(Treatment treatment) {
        this.id = treatment.getId();
        if(treatment.getBoarder() != null)
            this.boarder = new BoarderDto(treatment.getBoarder());
        if(treatment.getUser() != null)
            this.user = new UserDto(treatment.getUser());
        this.date = treatment.getDate();
        this.pst = treatment.isPst();
        this.irrigation = treatment.isIrrigation();
        this.therapeuticBath = treatment.isTherapeuticBath();
        this.drillWidth = treatment.getDrillWidth();
        this.drillLength = treatment.getDrillLength();
        this.debridement = treatment.isDebridement();
        this.treatmentOther = treatment.getTreatmentOther();
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
