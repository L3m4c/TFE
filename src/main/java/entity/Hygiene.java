package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Dams on 8/08/2014.
 */
@Entity
public class Hygiene {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private boolean toiletPartiel;
    private boolean toiletComplete;
    private boolean stimulated;
    private boolean bath;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isToiletPartiel() {
        return toiletPartiel;
    }

    public void setToiletPartiel(boolean toiletPartiel) {
        this.toiletPartiel = toiletPartiel;
    }

    public boolean isToiletComplete() {
        return toiletComplete;
    }

    public void setToiletComplete(boolean toiletComplete) {
        this.toiletComplete = toiletComplete;
    }

    public boolean isStimulated() {
        return stimulated;
    }

    public void setStimulated(boolean stimulated) {
        this.stimulated = stimulated;
    }

    public boolean isBath() {
        return bath;
    }

    public void setBath(boolean bath) {
        this.bath = bath;
    }
}
