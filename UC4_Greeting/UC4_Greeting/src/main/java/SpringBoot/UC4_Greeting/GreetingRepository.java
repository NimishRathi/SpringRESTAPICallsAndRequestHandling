package SpringBoot.UC4_Greeting;

import SpringBoot.UC4_Greeting.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}
