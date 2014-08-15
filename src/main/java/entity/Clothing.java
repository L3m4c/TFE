package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Dams on 9/08/2014.
 */
@Entity
public class Clothing {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private boolean clothingComplete;
    private boolean stimulated;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isClothingComplete() {
        return clothingComplete;
    }

    public void setClothingComplete(boolean clothingComplete) {
        this.clothingComplete = clothingComplete;
    }

    public boolean isStimulated() {
        return stimulated;
    }

    public void setStimulated(boolean stimulated) {
        this.stimulated = stimulated;
    }
}
