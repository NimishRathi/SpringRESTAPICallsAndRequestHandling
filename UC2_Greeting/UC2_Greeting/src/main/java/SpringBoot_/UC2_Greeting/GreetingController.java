// src/main/java/com/example/demo/controller/GreetingController.java
package SpringBoot_.UC2_Greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    // GET Request to return "Hello World"
    @GetMapping("/greeting")
    public String getGreeting() {
        return greetingService.getGreeting();
    }
}
