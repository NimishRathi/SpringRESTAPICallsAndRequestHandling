package SpringBoot.UC7_Greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/greetings")
public class GreetingController {

    private final GreetingService service;

    @Autowired
    public GreetingController(GreetingService service) {
        this.service = service;
    }

    // ✅ Endpoint to Edit a Greeting Message
    @PutMapping("/{id}")
    public ResponseEntity<Greeting> updateGreeting(@PathVariable Long id, @RequestBody Greeting newGreeting) {
        Greeting updatedGreeting = service.updateGreeting(id, newGreeting);
        return ResponseEntity.ok(updatedGreeting);
    }
}
