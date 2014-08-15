package dto;

import entity.SurroundingSkin;

/**
 * Created by Dams on 12/08/2014.
 */
public class SurroundingSkinDto {


    private long id;
    private boolean healthy;
    private boolean fragile;
    private boolean dry;
    private boolean hyperpigmented;
    private boolean hyperkeration;
    private boolean inflammatory;
    private boolean macerated;
    private boolean ulcerated;

    public SurroundingSkinDto() {}

    public SurroundingSkinDto(SurroundingSkin surroundingSkin) {
        this.id = surroundingSkin.getId();
        this.healthy = surroundingSkin.isHealthy();
        this.fragile = surroundingSkin.isFragile();
        this.dry = surroundingSkin.isDry();
        this.hyperpigmented = surroundingSkin.isHyperpigmented();
        this.hyperkeration = surroundingSkin.isHyperkeration();
        this.inflammatory = surroundingSkin.isInflammatory();
        this.macerated = surroundingSkin.isMacerated();
        this.ulcerated = surroundingSkin.isUlcerated();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    public boolean isDry() {
        return dry;
    }

    public void setDry(boolean dry) {
        this.dry = dry;
    }

    public boolean isHyperpigmented() {
        return hyperpigmented;
    }

    public void setHyperpigmented(boolean hyperpigmented) {
        this.hyperpigmented = hyperpigmented;
    }

    public boolean isHyperkeration() {
        return hyperkeration;
    }

    public void setHyperkeration(boolean hyperkeration) {
        this.hyperkeration = hyperkeration;
    }

    public boolean isInflammatory() {
        return inflammatory;
    }

    public void setInflammatory(boolean inflammatory) {
        this.inflammatory = inflammatory;
    }

    public boolean isMacerated() {
        return macerated;
    }

    public void setMacerated(boolean macerated) {
        this.macerated = macerated;
    }

    public boolean isUlcerated() {
        return ulcerated;
    }

    public void setUlcerated(boolean ulcerated) {
        this.ulcerated = ulcerated;
    }
}
