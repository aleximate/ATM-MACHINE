package ATMMachine.Atmproject.Controllers;

import ATMMachine.Atmproject.Models.Person;
import ATMMachine.Atmproject.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atm/persons/v0")
public class PersonController {
    @Autowired
    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/")
    public String save(@RequestBody Person person) {
        return personService.addPerson(person);
    }
}
