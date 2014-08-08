package dto;

import entity.Observation;

/**
 * Created by Dams on 6/08/2014.
 */
public class ObservationDto {

    private long id;
    private String comment;

    public ObservationDto() {}

    public ObservationDto(Observation observation) {
        this.id = observation.getId();
        this.comment = observation.getComment();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
