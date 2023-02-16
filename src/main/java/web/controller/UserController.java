package web.controller;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.User;
import web.service.UserService;


@Controller
@RequestMapping(name = "usersManagement")
public class UserController {
     private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/users")
        public String list(Model model) {
        model.addAttribute("users", userService.findAll());
        return "UserController/users";
    }

    @GetMapping(value = "/editUser/{id}")
    public String editUser(@PathVariable int id, ModelMap model) {
        model.addAttribute("user", userService.findById(id));
        return "userController/editUser";
    }
    @GetMapping(value = "/addUser")
    public String addUser(ModelMap model) {
        model.addAttribute("user", new User());
        return "userController/addUser";
    }

    @GetMapping(value="/deleteUser/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.delete(id);
        return "redirect:/";
    }
    @PostMapping(value="/editUser/{getId}")
    public String saveEditUser(@PathVariable int getId, @ModelAttribute("user") User user){
        user.setId(getId);
        userService.update(user);
        return "redirect:/";
    }
    @PostMapping(value="/addUser")
    public String saveUser(@ModelAttribute("user") User user){
        userService.save(user);
        return "redirect:/";
    }


}







/* @GetMapping(value = "/users")
    public String UserWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("He//o!");
        messages.add("I`m userService.Welcome!");
        messages.add("Have a nice day!!!!");
        model.addAttribute("messages", messages);
        return "UserController/users";
    }*/