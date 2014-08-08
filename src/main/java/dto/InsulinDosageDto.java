package dto;

import entity.InsulinDosage;

/**
 * Created by Dams on 6/08/2014.
 */
public class InsulinDosageDto {

        private long id;
        private int morning;
        private int midday;
        private int evening;
        private int night;

        public InsulinDosageDto() {}

        public InsulinDosageDto(InsulinDosage insulinDosage) {
            this.id = insulinDosage.getId();
            this.morning = insulinDosage.getMorning();
            this.midday = insulinDosage.getMidday();
            this.evening = insulinDosage.getEvening();
            this.night = insulinDosage.getNight();
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

    public int getNight() {
        return night;
    }

    public void setNight(int night) {
        this.night = night;
    }
}
