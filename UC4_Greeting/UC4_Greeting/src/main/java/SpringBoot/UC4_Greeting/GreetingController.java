package SpringBoot.UC4_Greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @PostMapping("/save")
    public ResponseEntity<String> saveGreeting(@RequestBody Greeting m) {
        Greeting savedGreeting = greetingService.saveGreeting(m);
        return ResponseEntity.ok("Greeting saved with ID: " + savedGreeting.getId()+" "+savedGreeting.getMessage());
    }
}
