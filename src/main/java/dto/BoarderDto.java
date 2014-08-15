package dto;

import entity.Boarder;

/**
 * Created by Sl0th on 27/06/2014.
 */
public class BoarderDto {

    private long id;
    private String name;
    private String surname;
    private int room;

    public BoarderDto() {}

    public BoarderDto(Boarder boarder) {
        this.id = boarder.getId();
        this.name = boarder.getName();
        this.surname = boarder.getSurname();
        this.room = boarder.getRoom();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
}
