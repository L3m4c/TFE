package controller;

import entity.User;
import entity.UserRepository;
import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Samuel on 15/08/2014.
 */
@RestController
public class LoginController {

    @Resource
    UserRepository userRepository;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void create(@RequestParam(value="username", required = true) String username,
                                   @RequestParam(value="password", required = true) String password, HttpServletResponse response) {
        User user = userRepository.findByUsername(username);
        if(user != null && user.getPassword().equals(password)) {
            response.setStatus(HttpServletResponse.SC_ACCEPTED);
        } else {
            try {
                response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
