package dto;

import entity.ToiletHelping;

import java.util.Date;

/**
 * Created by Dams on 9/08/2014.
 */
public class ToiletHelpingDto {

    private long id;
    private BoarderDto boarder;
    private UserDto user;
    private Date date;
    private boolean move;

    public ToiletHelpingDto() {}

    public ToiletHelpingDto(ToiletHelping toiletHelping) {
        this.id = toiletHelping.getId();
        if(toiletHelping.getBoarder() != null)
            this.boarder = new BoarderDto(toiletHelping.getBoarder());
        if(toiletHelping.getUser() != null)
            this.user = new UserDto(toiletHelping.getUser());
        this.date = toiletHelping.getDate();
        this.move = toiletHelping.isMove();
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

    public boolean isMove() {
        return move;
    }

    public void setMove(boolean move) {
        this.move = move;
    }
}
