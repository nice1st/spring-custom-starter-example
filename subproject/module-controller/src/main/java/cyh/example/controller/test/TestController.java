package cyh.example.controller.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cyh.example.properties.CyhProperties;

@RestController
@RequestMapping("/test")
@ConditionalOnProperty(prefix = "cyh", name = "name")
@EnableConfigurationProperties(CyhProperties.class)
public class TestController {

    @Autowired
    private CyhProperties cyhProperties;
    
    @GetMapping(value = "/text")
    public String text() {
        return "starter text! " + cyhProperties.getName();
    }
}
