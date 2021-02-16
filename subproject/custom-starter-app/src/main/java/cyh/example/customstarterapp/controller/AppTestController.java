package cyh.example.customstarterapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/test")
public class AppTestController {
    
    @GetMapping(value = "/text")
    public String text() {
        return "app text!";
    }
}
