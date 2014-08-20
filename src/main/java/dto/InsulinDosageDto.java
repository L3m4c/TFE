package dto;

import entity.InsulinDosage;

import java.util.Date;

/**
 * Created by Dams on 6/08/2014.
 */
public class InsulinDosageDto {

        private long id;
        private BoarderDto boarder;
        private UserDto user;
        private Date date;
        private int dosage;

        public InsulinDosageDto() {}

        public InsulinDosageDto(InsulinDosage insulinDosage) {
            this.id = insulinDosage.getId();
            if(insulinDosage.getBoarder() != null)
                this.boarder = new BoarderDto(insulinDosage.getBoarder());
            if(insulinDosage.getUser() != null)
                this.user = new UserDto(insulinDosage.getUser());
            this.date = insulinDosage.getDate();
            this.dosage = insulinDosage.getDosage();

        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public BoarderDto getBoarder() {
        return boarder;
        }

        public void setBoarder(BoarderDto boarder) {
            this.boarder = boarder;
        }

        public UserDto getUser() {
            return user;
        }

        public void setUser(UserDto user) {
            this.user = user;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public int getDosage() {
            return dosage;
        }

        public void setDosage(int dosage) {
            this.dosage = dosage;
        }
}
