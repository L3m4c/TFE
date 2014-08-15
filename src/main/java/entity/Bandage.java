package entity;

/**
 * Created by Dams on 12/08/2014.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bandage {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String product;
    private String bandageCovering;
    private String comment;

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
