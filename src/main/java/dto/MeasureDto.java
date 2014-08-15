package dto;

import entity.Measure;

/**
 * Created by Dams on 11/08/2014.
 */
public class MeasureDto {

    private long id;
    private int size;
    private int depth;
    private String quantity;
    private String nature;
    private boolean odor;

    public MeasureDto() {}

    public MeasureDto(Measure measure) {
        this.id = measure.getId();
        this.size = measure.getSize();
        this.depth = measure.getDepth();
        this.quantity = measure.getQuantity();
        this.nature = measure.getNature();
        this.odor = measure.isOdor();
            }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public boolean isOdor() {
        return odor;
    }

    public void setOdor(boolean odor) {
        this.odor = odor;
    }
}
