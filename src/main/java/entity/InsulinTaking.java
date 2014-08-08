package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Dams on 6/08/2014.
 */
@Entity
public class InsulinTaking {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private int morning;
    private int midday;
    private int evening;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMorning() {
        return morning;
    }

    public void setMorning(int morning) {
        this.morning = morning;
    }

    public int getMidday() {
        return midday;
    }

    public void setMidday(int midday) {
        this.midday = midday;
    }

    public int getEvening() {
        return evening;
    }

    public void setEvening(int evening) {
        this.evening = evening;
    }
}
