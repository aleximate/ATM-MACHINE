package ATMMachine.Atmproject.Repositories;

import ATMMachine.Atmproject.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
