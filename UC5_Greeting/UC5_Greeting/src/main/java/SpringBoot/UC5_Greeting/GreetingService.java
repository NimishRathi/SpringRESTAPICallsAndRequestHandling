package SpringBoot.UC5_Greeting;

import SpringBoot.UC5_Greeting.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class GreetingService {
    private final GreetingRepository repository;

    @Autowired
    public GreetingService(GreetingRepository repository) {
        this.repository = repository;
    }

    public Greeting getGreetingById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Greeting not found with id: " + id));
    }
}
