package SpringBoot.UC5_Greeting;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
    Optional<Greeting> findById(Long id);
}
