// src/main/java/com/example/demo/controller/GreetingController.java
package SpringBoot_.UC1_Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    // 1. GET Request (http://localhost:8080/greeting)
    @GetMapping
    public Greeting getGreeting() {
        return new Greeting("Hello from GET Method");
    }

    // 2. POST Request (http://localhost:8080/greeting)
    @PostMapping
    public Greeting postGreeting(@RequestBody Greeting greeting) {
        return new Greeting("Hello, " + greeting.getMessage() + " from POST Method");
    }

    // 3. PUT Request (http://localhost:8080/greeting/{name})
    @PutMapping("/{name}")
    public Greeting putGreeting(@PathVariable String name) {
        return new Greeting("Hello, " + name + " from PUT Method");
    }

    // 4. DELETE Request (http://localhost:8080/greeting/{name})
    @DeleteMapping("/{name}")
    public Greeting deleteGreeting(@PathVariable String name) {
        return new Greeting("Goodbye, " + name + " from DELETE Method");
    }
}
