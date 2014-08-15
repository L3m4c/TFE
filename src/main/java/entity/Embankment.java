package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Dams on 12/08/2014.
 */
@Entity
public class Embankment {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private boolean regular;
    private boolean irregular;
    private boolean furrow;
    private boolean detachment;
    private boolean budding;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    public boolean isIrregular() {
        return irregular;
    }

    public void setIrregular(boolean irregular) {
        this.irregular = irregular;
    }

    public boolean isFurrow() {
        return furrow;
    }

    public void setFurrow(boolean furrow) {
        this.furrow = furrow;
    }

    public boolean isDetachment() {
        return detachment;
    }

    public void setDetachment(boolean detachment) {
        this.detachment = detachment;
    }

    public boolean isBudding() {
        return budding;
    }

    public void setBudding(boolean budding) {
        this.budding = budding;
    }
}
