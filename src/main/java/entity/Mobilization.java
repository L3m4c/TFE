package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Dams on 9/08/2014.
 */
@Entity
public class Mobilization {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private boolean help;
    private boolean material;
    private boolean cane;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isHelp() {
        return help;
    }

    public void setHelp(boolean help) {
        this.help = help;
    }

    public boolean isMaterial() {
        return material;
    }

    public void setMaterial(boolean material) {
        this.material = material;
    }

    public boolean isCane() {
        return cane;
    }

    public void setCane(boolean cane) {
        this.cane = cane;
    }
}
