package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Dams on 11/08/2014.
 */
@Entity
public class Measure {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private int size;
    private int depth;
    private String quantity;
    private String nature;
    private boolean odor;

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
