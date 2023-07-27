package ATMMachine.Atmproject.Services;

import ATMMachine.Atmproject.Models.Person;
import ATMMachine.Atmproject.Repositories.PersonRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    @Transactional
    public String addPerson(Person person) {
        String dni = person.getDni();
        String firstName = person.getFirstName();
        String lastName = person.getLastName();
        String email = person.getEmail();
        Long cellPhone = person.getCellPhone();
        String address = person.getAddress();

        personRepository.addPerson(dni, firstName, lastName, email, cellPhone, address);

        try {
            return "the operation was succesful";
        } catch (Error e) {
            return e.getMessage();
        }
    }
}
