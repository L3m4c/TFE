package dto;

import entity.Bandage;

/**
 * Created by Dams on 12/08/2014.
 */
public class BandageDto {

    private long id;
    private String product;
    private String bandageCovering;
    private String comment;

    public BandageDto() {}

    public BandageDto(Bandage bandage) {
        this.id = bandage.getId();
        this.product = bandage.getProduct();
        this.bandageCovering = bandage.getBandageCovering();
        this.comment = bandage.getComment();

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getBandageCovering() {
        return bandageCovering;
    }

    public void setBandageCovering(String bandageCovering) {
        this.bandageCovering = bandageCovering;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
