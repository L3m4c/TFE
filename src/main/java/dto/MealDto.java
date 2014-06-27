package dto;

import entity.Meal;

import java.util.Date;

/**
 * Created by Sl0th on 27/06/2014.
 */
public class MealDto {

    private long id;
    private long boarder;
    private long user;
    private Date date;

    public MealDto() {}

    public MealDto(Meal meal) {
        this.id = meal.getId();
        if(meal.getBoarder() != null)
            this.boarder = meal.getBoarder().getId();
        if(meal.getUser() != null)
            this.user = meal.getUser().getId();
        this.date = meal.getDate();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBoarder() {
        return boarder;
    }

    public void setBoarder(long boarder) {
        this.boarder = boarder;
    }

    public long getUser() {
        return user;
    }

    public void setUser(long user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
