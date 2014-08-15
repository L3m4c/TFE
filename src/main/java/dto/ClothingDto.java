package dto;

import entity.Clothing;

/**
 * Created by Dams on 9/08/2014.
 */
public class ClothingDto {

    private long id;
    private boolean clothingComplete;
    private boolean stimulated;

    public ClothingDto() {}

    public ClothingDto(Clothing clothing) {
        this.id = clothing.getId();
        this.clothingComplete = clothing.isClothingComplete();
        this.stimulated = clothing.isStimulated();
            }

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
