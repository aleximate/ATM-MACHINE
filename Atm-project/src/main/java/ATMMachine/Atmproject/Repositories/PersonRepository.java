package ATMMachine.Atmproject.Repositories;

import ATMMachine.Atmproject.Dto.PersonDto;
import ATMMachine.Atmproject.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Long> {
    @Modifying
    @Query(value = """
            INSERT INTO Person(
            dni,
            firstName,
            lastName,
            email,
            cellPhone,
            address)
            VALUES(
            :dni,
            :firstName,
            :lastName,
            :email,
            :cellPhone,
            :address)
            """)
    public void addPerson(@Param("dni") String dni,
                          @Param("firstName") String firstName,
                          @Param("lastName") String lastName,
                          @Param("email") String email,
                          @Param("cellPhone") Long cellPhone,
                          @Param("address") String address);
}
