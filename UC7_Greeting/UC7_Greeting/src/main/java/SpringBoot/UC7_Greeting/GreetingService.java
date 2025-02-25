package SpringBoot.UC7_Greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final Greeting.GreetingRepository repository;

    @Autowired
    public GreetingService(Greeting.GreetingRepository repository) {
        this.repository = repository;
    }

    // ✅ Method to Edit a Greeting
    public Greeting updateGreeting(Long id, Greeting newGreeting) {
        return repository.findById(id)
                .map(existingGreeting -> {
                    existingGreeting.setMessage(newGreeting.getMessage());
                    return repository.save(existingGreeting);
                })
                .orElseThrow(() -> new RuntimeException("Greeting not found with id: " + id));
    }
}
