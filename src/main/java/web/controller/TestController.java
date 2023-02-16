package web.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "/good")
public class TestController {

    @GetMapping(value = "/test")
    public String testWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("He//o!");
        messages.add("how do you do?");
        messages.add("have a nice day!");
        model.addAttribute("messages", messages);
        return "TestController/good";
    }

}
