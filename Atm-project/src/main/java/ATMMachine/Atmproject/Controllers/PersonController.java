package ATMMachine.Atmproject.Controllers;

import ATMMachine.Atmproject.Models.Person;
import ATMMachine.Atmproject.Repositories.PersonRepository;
import ATMMachine.Atmproject.Services.PersonService;
import org.aspectj.weaver.patterns.PerObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atm/persons/v0")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @PostMapping
    public ResponseEntity<Person>save(@RequestBody Person person)
    {
        Person person1=personRepository.save(person);
        return ResponseEntity.ok(person1);
    }




}
