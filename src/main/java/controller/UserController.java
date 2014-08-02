package controller;

import dto.UserDto;
import entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Sl0th on 27/06/2014.
 */
@RestController
public class UserController {

    @Resource
    UserRepository userRepository;

    @Autowired
    UserService userService;


    @RequestMapping(value = "/user/all", method = RequestMethod.GET)
    public List<UserDto> getAll() {
        return userService.findAll();
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public UserDto create(@RequestParam(value="enabled", required = true) boolean enabled,
                             @RequestParam(value="name", required = true) String name,
                             @RequestParam(value="password", required = true) String password,
                             @RequestParam(value="role", required = true) String role,
                             @RequestParam(value="surname", required = true) String surname,
                             @RequestParam(value="username", required = true) String username) {
        return userService.save(enabled, name, password, role, surname, username);
    }

}
