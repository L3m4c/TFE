package dto;

import entity.User;

/**
 * Created by Sl0th on 27/06/2014.
 */
public class UserDto {

    private long id;
    private String surname;
    private String name;
    private String role;

    public UserDto() {}
    public UserDto(User user) {
        this.id = user.getId();
        this.surname = user.getSurname();
        this.name = user.getName();
        this.role = user.getRole();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
