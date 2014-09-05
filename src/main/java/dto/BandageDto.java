package dto;

import entity.Bandage;

import java.util.Date;

/**
 * Created by Dams on 12/08/2014.
 */
public class BandageDto {

    private long id;
    private BoarderDto boarder;
    private UserDto user;
    private Date date;
    private String product;
    private String bandageCovering;
    private String comment;

    public BandageDto() {}

    public BandageDto(Bandage bandage) {
        this.id = bandage.getId();
        if(bandage.getBoarder() != null)
            this.boarder = new BoarderDto(bandage.getBoarder());
        if(bandage.getUser() != null)
            this.user = new UserDto(bandage.getUser());
        this.date = bandage.getDate();
        this.product = bandage.getProduct();
        this.bandageCovering = bandage.getBandageCovering();
        this.comment = bandage.getComment();

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

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getBandageCovering() {
        return bandageCovering;
    }

    public void setBandageCovering(String bandageCovering) {
        this.bandageCovering = bandageCovering;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
