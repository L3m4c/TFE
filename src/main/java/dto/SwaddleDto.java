package dto;

import entity.Swaddle;

/**
 * Created by Dams on 1/07/2014.
 */
public class SwaddleDto {
    private long id;
    private BoarderDto boarder;
    private UserDto user;
    private long date;

    public SwaddleDto() {}

    public SwaddleDto(Swaddle swaddle) {
        this.id = swaddle.getId();
        if(swaddle.getBoarder() != null)
            this.boarder = new BoarderDto(swaddle.getBoarder());
        if(swaddle.getUser() != null)
            this.user = new UserDto(swaddle.getUser());
        this.date = swaddle.getDate().getTime();
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
