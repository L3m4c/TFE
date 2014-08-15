package dto;

import entity.RolePermission;

/**
 * Created by Dams on 15/08/2014.
 */
public class RolePermissionDto {

    private long id;
    private String role;
    private String permission;
    private boolean hasPermission;

    public RolePermissionDto() {}

    public RolePermissionDto(RolePermission rolePermission) {
        this.id = rolePermission.getId();
        this.role = rolePermission.getRole();
        this.permission = rolePermission.getPermission();
        this.hasPermission = rolePermission.isHasPermission();

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public boolean isHasPermission() {
        return hasPermission;
    }

    public void setHasPermission(boolean hasPermission) {
        this.hasPermission = hasPermission;
    }
}
