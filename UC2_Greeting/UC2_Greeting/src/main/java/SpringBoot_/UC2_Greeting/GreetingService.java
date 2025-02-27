// src/main/java/com/example/demo/service/GreetingService.java
package SpringBoot_.UC2_Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreeting() {
        return "Hello World";
    }
}
