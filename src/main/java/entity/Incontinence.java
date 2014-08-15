package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Dams on 9/08/2014.
 */
@Entity
public class Incontinence {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private boolean diurnal;
    private boolean nocturnal;
    private boolean both;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isDiurnal() {
        return diurnal;
    }

    public void setDiurnal(boolean diurnal) {
        this.diurnal = diurnal;
    }

    public boolean isNocturnal() {
        return nocturnal;
    }

    public void setNocturnal(boolean nocturnal) {
        this.nocturnal = nocturnal;
    }

    public boolean isBoth() {
        return both;
    }

    public void setBoth(boolean both) {
        this.both = both;
    }
}
