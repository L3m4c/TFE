package dto;

import entity.Observation;

/**
 * Created by Dams on 6/08/2014.
 */
public class ObservationDto {

    private long id;
    private BoarderDto boarder;
    private UserDto user;
    private long date;
    private String comment;

    public ObservationDto() {}

    public ObservationDto(Observation observation) {
        this.id = observation.getId();
        if(observation.getBoarder() != null)
            this.boarder = new BoarderDto(observation.getBoarder());
        if(observation.getUser() != null)
            this.user = new UserDto(observation.getUser());
        this.date = observation.getDate().getTime();
        this.comment = observation.getComment();
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

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
