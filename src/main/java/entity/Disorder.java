package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Dams on 9/08/2014.
 */
@Entity
public class Disorder {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private boolean timeDisorientation;
    private boolean spaceDisorientation;
    private boolean termDifficulty;
    private boolean verbalDifficulty;
    private boolean lossConcept;
    private boolean agitated;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isTimeDisorientation() {
        return timeDisorientation;
    }

    public void setTimeDisorientation(boolean timeDisorientation) {
        this.timeDisorientation = timeDisorientation;
    }

    public boolean isSpaceDisorientation() {
        return spaceDisorientation;
    }

    public void setSpaceDisorientation(boolean spaceDisorientation) {
        this.spaceDisorientation = spaceDisorientation;
    }

    public boolean isTermDifficulty() {
        return termDifficulty;
    }

    public void setTermDifficulty(boolean termDifficulty) {
        this.termDifficulty = termDifficulty;
    }

    public boolean isVerbalDifficulty() {
        return verbalDifficulty;
    }

    public void setVerbalDifficulty(boolean verbalDifficulty) {
        this.verbalDifficulty = verbalDifficulty;
    }

    public boolean isLossConcept() {
        return lossConcept;
    }

    public void setLossConcept(boolean lossConcept) {
        this.lossConcept = lossConcept;
    }

    public boolean isAgitated() {
        return agitated;
    }

    public void setAgitated(boolean agitated) {
        this.agitated = agitated;
    }
}
