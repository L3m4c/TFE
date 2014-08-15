package dto;

import entity.Aspect;

/**
 * Created by Dams on 11/08/2014.
 */
public class AspectDto {

    private long id;
    private boolean redness;
    private boolean fibrin;
    private boolean necrosis;
    private boolean pink;
    private String other;


    public AspectDto() {}

    public AspectDto(Aspect aspect) {
        this.id = aspect.getId();
        this.redness = aspect.isRedness();
        this.fibrin = aspect.isFibrin();
        this.necrosis = aspect.isNecrosis();
        this.pink = aspect.isPink();
        this.other = aspect.getOther();
            }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isRedness() {
        return redness;
    }

    public void setRedness(boolean redness) {
        this.redness = redness;
    }

    public boolean isFibrin() {
        return fibrin;
    }

    public void setFibrin(boolean fibrin) {
        this.fibrin = fibrin;
    }

    public boolean isNecrosis() {
        return necrosis;
    }

    public void setNecrosis(boolean necrosis) {
        this.necrosis = necrosis;
    }

    public boolean isPink() {
        return pink;
    }

    public void setPink(boolean pink) {
        this.pink = pink;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
