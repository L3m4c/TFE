package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Dams on 9/08/2014.
 */
@Entity
public class Eat {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private boolean priorAid;
    private boolean fullAid;
    private boolean stimulated;
    private boolean hydration;

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
