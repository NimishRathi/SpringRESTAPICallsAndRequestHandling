package SpringBoot.UC6_Greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    private final GreetingRepository repository;

    @Autowired
    public GreetingService(GreetingRepository repository) {
        this.repository = repository;
    }

    // Method to list all greetings
    public List<Greeting> getAllGreetings() {
        return repository.findAll();
    }
}
