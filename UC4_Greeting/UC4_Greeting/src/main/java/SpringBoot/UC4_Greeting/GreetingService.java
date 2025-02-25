package SpringBoot.UC4_Greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    public Greeting saveGreeting(Greeting message) {
        Greeting greeting = new Greeting();
        greeting.setMessage(message.getMessage());
        return greetingRepository.save(greeting);  // Save the greeting message
    }
}
