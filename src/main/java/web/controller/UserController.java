package web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.User;
import web.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }
    @RequestMapping("/findById")
    public User findById(Integer id) {
        return userService.findById(id);
    }
    @RequestMapping("/save")
    public void save(User user) {
        userService.save(user);
    }
    @RequestMapping("/update")
    public void update(User user) {
        userService.update(user);
    }
    @RequestMapping("/delete")
    public void delete(User user) {
        userService.delete(user);
    }

}
