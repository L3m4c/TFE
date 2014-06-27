package controller;

import entity.UserRepository;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Sl0th on 27/06/2014.
 */
@RestController
public class UserController {

    @Resource
    UserRepository userRepository;


}
