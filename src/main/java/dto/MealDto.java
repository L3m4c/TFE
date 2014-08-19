package dto;

import entity.Meal;

import java.util.Date;

/**
 * Created by Sl0th on 27/06/2014.
 */
public class MealDto {

    private long id;
    private BoarderDto boarder;
    private UserDto user;
    private long date;

    public MealDto() {}

    public MealDto(Meal meal) {
        this.id = meal.getId();
        if(meal.getBoarder() != null)
            this.boarder = new BoarderDto(meal.getBoarder());
        if(meal.getUser() != null)
            this.user = new UserDto(meal.getUser());
        this.date = meal.getDate().getTime();
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
}
