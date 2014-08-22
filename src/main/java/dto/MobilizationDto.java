package dto;

import entity.Mobilization;

import java.util.Date;

/**
 * Created by Dams on 9/08/2014.
 */
public class MobilizationDto {

    private long id;
    private BoarderDto boarder;
    private UserDto user;
    private Date date;
    private boolean help;
    private boolean material;
    private boolean cane;

    public MobilizationDto() {}

    public MobilizationDto(Mobilization mobilization) {
        this.id = mobilization.getId();
        if(mobilization.getBoarder() != null)
            this.boarder = new BoarderDto(mobilization.getBoarder());
        if(mobilization.getUser() != null)
            this.user = new UserDto(mobilization.getUser());
        this.date = mobilization.getDate();
        this.help = mobilization.isHelp();
        this.material = mobilization.isMaterial();
        this.cane = mobilization.isCane();
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

    public boolean isHelp() {
        return help;
    }

    public void setHelp(boolean help) {
        this.help = help;
    }

    public boolean isMaterial() {
        return material;
    }

    public void setMaterial(boolean material) {
        this.material = material;
    }

    public boolean isCane() {
        return cane;
    }

    public void setCane(boolean cane) {
        this.cane = cane;
    }
}
