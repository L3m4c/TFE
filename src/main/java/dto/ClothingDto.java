package dto;

import entity.Clothing;

import java.util.Date;

/**
 * Created by Dams on 9/08/2014.
 */
public class ClothingDto {

    private long id;
    private BoarderDto boarder;
    private UserDto user;
    private Date date;
    private boolean clothingComplete;
    private boolean stimulated;

    public ClothingDto() {}

    public ClothingDto(Clothing clothing) {
        this.id = clothing.getId();
        if(clothing.getBoarder() != null)
            this.boarder = new BoarderDto(clothing.getBoarder());
        if(clothing.getUser() != null)
            this.user = new UserDto(clothing.getUser());
        this.date = clothing.getDate();
        this.clothingComplete = clothing.isClothingComplete();
        this.stimulated = clothing.isStimulated();
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

    public boolean isClothingComplete() {
        return clothingComplete;
    }

    public void setClothingComplete(boolean clothingComplete) {
        this.clothingComplete = clothingComplete;
    }

    public boolean isStimulated() {
        return stimulated;
    }

    public void setStimulated(boolean stimulated) {
        this.stimulated = stimulated;
    }
}
