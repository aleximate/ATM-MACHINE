package ATMMachine.Atmproject.Repositories;

import ATMMachine.Atmproject.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
