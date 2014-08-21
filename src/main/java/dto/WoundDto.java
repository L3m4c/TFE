package dto;

import entity.Wound;

import java.util.Date;

/**
 * Created by Dams on 7/08/2014.
 */
public class WoundDto {

    private long id;
    private BoarderDto boarder;
    private UserDto user;
    private Date date;
    private String localisation;
    private String type;
    private String description;


    public WoundDto() {}

    public WoundDto(Wound wound) {
        this.id = wound.getId();
        if(wound.getBoarder() != null)
            this.boarder = new BoarderDto(wound.getBoarder());
        if(wound.getUser() != null)
            this.user = new UserDto(wound.getUser());

        this.date = wound.getDate();
        if (wound.getLocalisation() != null)
            this.localisation = wound.getLocalisation();
        if (wound.getType() != null)
            this.type = wound.getType();
        if (wound.getDescription() != null)
            this.description = wound.getDescription();
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

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
