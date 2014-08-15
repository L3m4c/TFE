package dto;

import entity.Eat;

/**
 * Created by Dams on 9/08/2014.
 */
public class EatDto {

    private long id;
    private boolean priorAid;
    private boolean fullAid;
    private boolean stimulated;
    private boolean hydration;

    public EatDto() {}

    public EatDto(Eat eat) {
        this.id = eat.getId();
        this.priorAid = eat.isPriorAid();
        this.fullAid = eat.isFullAid();
        this.stimulated = eat.isStimulated();
        this.hydration = eat.isHydration();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isPriorAid() {
        return priorAid;
    }

    public void setPriorAid(boolean priorAid) {
        this.priorAid = priorAid;
    }

    public boolean isFullAid() {
        return fullAid;
    }

    public void setFullAid(boolean fullAid) {
        this.fullAid = fullAid;
    }

    public boolean isStimulated() {
        return stimulated;
    }

    public void setStimulated(boolean stimulated) {
        this.stimulated = stimulated;
    }

    public boolean isHydration() {
        return hydration;
    }

    public void setHydration(boolean hydration) {
        this.hydration = hydration;
    }
}
