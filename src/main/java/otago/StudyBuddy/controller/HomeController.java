package otago.StudyBuddy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String getStartPage() {
        return "index";
    }
    
    @GetMapping("/home")
    public String getHomePage() {
        return "home";
    }
}