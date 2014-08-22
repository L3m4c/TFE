package dto;

import entity.Disorder;

import java.util.Date;

/**
 * Created by Dams on 9/08/2014.
 */
public class DisorderDto {

    private long id;
    private BoarderDto boarder;
    private UserDto user;
    private Date date;
    private boolean timeDisorientation;
    private boolean spaceDisorientation;
    private boolean termDifficulty;
    private boolean verbalDifficulty;
    private boolean lossConcept;
    private boolean agitated;

    public DisorderDto() {}

    public DisorderDto(Disorder disorder) {
        this.id = disorder.getId();
        if(disorder.getBoarder() != null)
            this.boarder = new BoarderDto(disorder.getBoarder());
        if(disorder.getUser() != null)
            this.user = new UserDto(disorder.getUser());
        this.date = disorder.getDate();
        this.timeDisorientation = disorder.isTimeDisorientation();
        this.spaceDisorientation = disorder.isSpaceDisorientation();
        this.termDifficulty = disorder.isTermDifficulty();
        this.verbalDifficulty = disorder.isVerbalDifficulty();
        this.lossConcept = disorder.isLossConcept();
        this.agitated = disorder.isAgitated();

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

    public boolean isTimeDisorientation() {
        return timeDisorientation;
    }

    public void setTimeDisorientation(boolean timeDisorientation) {
        this.timeDisorientation = timeDisorientation;
    }

    public boolean isSpaceDisorientation() {
        return spaceDisorientation;
    }

    public void setSpaceDisorientation(boolean spaceDisorientation) {
        this.spaceDisorientation = spaceDisorientation;
    }

    public boolean isTermDifficulty() {
        return termDifficulty;
    }

    public void setTermDifficulty(boolean termDifficulty) {
        this.termDifficulty = termDifficulty;
    }

    public boolean isVerbalDifficulty() {
        return verbalDifficulty;
    }

    public void setVerbalDifficulty(boolean verbalDifficulty) {
        this.verbalDifficulty = verbalDifficulty;
    }

    public boolean isLossConcept() {
        return lossConcept;
    }

    public void setLossConcept(boolean lossConcept) {
        this.lossConcept = lossConcept;
    }

    public boolean isAgitated() {
        return agitated;
    }

    public void setAgitated(boolean agitated) {
        this.agitated = agitated;
    }
}
