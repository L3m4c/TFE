package dto;

import entity.Mobilization;

/**
 * Created by Dams on 9/08/2014.
 */
public class MobilizationDto {

    private long id;
    private boolean help;
    private boolean material;
    private boolean cane;

    public MobilizationDto() {}

    public MobilizationDto(Mobilization mobilization) {
        this.id = mobilization.getId();
        this.help = mobilization.isHelp();
        this.material = mobilization.isMaterial();
        this.cane = mobilization.isCane();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isHelp() {
        return help;
    }

    public void setHelp(boolean help) {
        this.help = help;
    }

    public boolean isMaterial() {
        return material;
    }

    public void setMaterial(boolean material) {
        this.material = material;
    }

    public boolean isCane() {
        return cane;
    }

    public void setCane(boolean cane) {
        this.cane = cane;
    }
}
