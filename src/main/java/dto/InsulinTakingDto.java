package dto;

import entity.InsulinTaking;

/**
 * Created by Dams on 6/08/2014.
 */
public class InsulinTakingDto {

    private long id;
    private int morning;
    private int midday;
    private int evening;

    public InsulinTakingDto() {}

    public InsulinTakingDto(InsulinTaking insulinTaking) {
        this.id = insulinTaking.getId();
        this.morning = insulinTaking.getMorning();
        this.midday = insulinTaking.getMidday();
        this.evening = insulinTaking.getEvening();

    }

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
