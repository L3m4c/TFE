package service;

import dto.UserDto;
import entity.User;
import entity.UserRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Sl0th on 27/06/2014.
 */
public class UserService {

    @Resource
    UserRepository userRepository;

    public User getCurrentUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return userRepository.findByUsername(auth.getName());
    }

    public List<UserDto> findAll() {
        Iterator i = userRepository.findAll().iterator();
        List<UserDto> listUser = new ArrayList<UserDto>();
        while(i.hasNext()) {
            listUser.add(new UserDto((User)i.next()));
        }
        return listUser;
    }

    public UserDto save(boolean enabled, String name , String password, String role, String surname, String username) {
        User user = new User();
        user.setEnabled(enabled);
        user.setName(name);
        user.setPassword(password);
        user.setRole(role);
        user.setSurname(surname);
        user.setUsername(username);
        return new UserDto(userRepository.save(user));
    }

}
