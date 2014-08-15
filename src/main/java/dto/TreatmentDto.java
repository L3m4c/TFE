package dto;

import entity.Treatment;

/**
 * Created by Dams on 12/08/2014.
 */
public class TreatmentDto {

    private long id;
    private boolean pst;
    private boolean irrigation;
    private boolean therapeuticBath;
    private int drillWidth;
    private int drillLength;
    private boolean debridement;
    private String other;

    public TreatmentDto() {}

    public TreatmentDto(Treatment treatment) {
        this.id = treatment.getId();
        this.pst = treatment.isPst();
        this.irrigation = treatment.isIrrigation();
        this.therapeuticBath = treatment.isTherapeuticBath();
        this.drillWidth = treatment.getDrillWidth();
        this.drillLength = treatment.getDrillLength();
        this.debridement = treatment.isDebridement();
        this.other = treatment.getOther();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
