package dto;

import entity.Hygiene;

/**
 * Created by Dams on 8/08/2014.
 */
public class HygieneDto {

    private long id;
    private boolean toiletPartiel;
    private boolean toiletComplete;
    private boolean stimulated;
    private boolean bath;

    public HygieneDto() {}

    public HygieneDto(Hygiene hygiene) {
        this.id = hygiene.getId();
        this.toiletPartiel = hygiene.isToiletPartiel();
        this.toiletComplete = hygiene.isToiletComplete();
        this.stimulated = hygiene.isStimulated();
        this.bath = hygiene.isBath();

    }

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
