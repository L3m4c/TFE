package controller;

import dto.RolePermissionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.RolePermissionService;

import java.util.List;

/**
 * Created by Dams on 15/08/2014.
 */
@RestController
public class RolePermissionController {

    @Autowired
    RolePermissionService rolePermissionService;

    @RequestMapping(value = "/rolePermission", method = RequestMethod.POST)
    public RolePermissionDto create(@RequestParam(value="role", required = true) String role,
                                    @RequestParam(value="permission", required = true) String permission,
                          @RequestParam(value="hasPermission", required = true) boolean hasPermission){
        return rolePermissionService.save(role, permission, hasPermission);
    }

    @RequestMapping(value = "/rolePermission", method = RequestMethod.GET)
    public RolePermissionDto get(
            @RequestParam(value = "id", required = true) long id){
        return rolePermissionService.findById(id);
    }

    @RequestMapping(value = "/rolePermission", method = RequestMethod.DELETE)
    public void delete(
            @RequestParam(value = "id", required = true) long id) {
        rolePermissionService.delete(id);
    }

    @RequestMapping(value = "/rolePermission", method = RequestMethod.PUT)
    public RolePermissionDto update(
            @RequestParam(value = "id", required = true) long id,
            @RequestParam(value="role", required = false) String role,
            @RequestParam(value="permission", required = false) String permission,
            @RequestParam(value="hasPermission", required = true, defaultValue= "false") boolean hasPermission){

        return rolePermissionService.update(id, role, permission, hasPermission);
    }

    @RequestMapping(value = "/rolePermission/all", method = RequestMethod.GET)
    public List<RolePermissionDto> getAll() {
        return rolePermissionService.findAll();
    }

}
