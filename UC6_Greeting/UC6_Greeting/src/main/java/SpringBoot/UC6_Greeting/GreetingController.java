package SpringBoot.UC6_Greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/greetings")
public class GreetingController {

    private final GreetingService service;

    @Autowired
    public GreetingController(GreetingService service) {
        this.service = service;
    }

    // Endpoint to list all greetings
    @GetMapping
    public ResponseEntity<List<Greeting>> getAllGreetings() {
        List<Greeting> greetings = service.getAllGreetings();
        return ResponseEntity.ok(greetings);
    }
}
