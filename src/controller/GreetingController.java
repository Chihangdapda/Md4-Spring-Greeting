package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/home")
    public String greeting(@RequestParam String user, Model model){
        model.addAttribute("user", user);
        return "home";
    }
}
