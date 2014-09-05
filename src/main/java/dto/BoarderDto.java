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
    private int age;
    private String dateBirth;
    private String mutuel;
    private String personResponsible;
    private String phone;

    public BoarderDto() {}

    public BoarderDto(Boarder boarder) {
        this.id = boarder.getId();
        this.name = boarder.getName();
        this.surname = boarder.getSurname();
        this.room = boarder.getRoom();
        this.age =  boarder.getAge();
        this.dateBirth = boarder.getDateBirth();
        this.mutuel = boarder.getMutuel();
        this.personResponsible = boarder.getPersonResponsible();
        this.phone = boarder.getPhone();
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getMutuel() {
        return mutuel;
    }

    public void setMutuel(String mutuel) {
        this.mutuel = mutuel;
    }

    public String getPersonResponsible() {
        return personResponsible;
    }

    public void setPersonResponsible(String personResponsible) {
        this.personResponsible = personResponsible;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
