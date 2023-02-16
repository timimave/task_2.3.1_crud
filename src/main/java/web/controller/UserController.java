package web.controller;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import web.service.UserService;


@Controller
@RequestMapping(name = "usersManagement")
public class UserController {


     private UserService userService;

    @GetMapping(value = "/users")
    public String UserWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("He//o!");
        messages.add("I`m userService.Welcome!");
        messages.add("Have a nice day!!!!");
        model.addAttribute("messages", messages);
        return "UserController/users";
    }

}




/* @GetMapping
        public String list(Model model) {
        model.addAttribute("users", userService.findAll());
        return "users";
    }

    @GetMapping(value = "/editUser/{id}")
    public String editUser(@PathVariable int id, ModelMap model) {
        model.addAttribute("user", userService.findById(id));
        return "editUser";
    }
    @GetMapping(value = "/addUser")
    public String addUser(ModelMap model) {
        model.addAttribute("user", new User());
        return "add";
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
    }*/