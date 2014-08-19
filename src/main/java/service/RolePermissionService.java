package service;

import dto.RolePermissionDto;
import entity.RolePermission;
import entity.RolePermissionRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dams on 15/08/2014.
 */
public class RolePermissionService {

    @Resource
    RolePermissionRepository rolePermissionRepository;

    public List<RolePermissionDto> findAll() {
        Iterator i = rolePermissionRepository.findAll().iterator();
        List<RolePermissionDto> listRolePermission = new ArrayList<RolePermissionDto>();
        while (i.hasNext()) {
            listRolePermission.add(new RolePermissionDto((RolePermission) i.next()));
        }
        return listRolePermission;
    }

    public RolePermissionDto findById(long id) {
        return new RolePermissionDto(rolePermissionRepository.findOne(id));
    }

    public void delete(long id) {
        rolePermissionRepository.delete(id);
    }

    public RolePermissionDto save(String role, String permission, boolean hasPermission) {
        RolePermission rolePermission = new RolePermission();
        rolePermission.setRole(role);
        rolePermission.setPermission(permission);
        rolePermission.setHasPermission(hasPermission);

        return new RolePermissionDto(rolePermissionRepository.save(rolePermission));
    }

    public RolePermissionDto update(long id, String role, String permission, boolean hasPermission) {
        RolePermission rolePermission = rolePermissionRepository.findOne(id);

        rolePermission.setRole(role);
        rolePermission.setPermission(permission);
        rolePermission.setHasPermission(hasPermission);

        return new RolePermissionDto(rolePermissionRepository.save(rolePermission));

    }

}
