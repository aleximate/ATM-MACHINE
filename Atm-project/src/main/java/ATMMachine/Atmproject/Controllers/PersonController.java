package ATMMachine.Atmproject.Controllers;

import ATMMachine.Atmproject.Models.Card;
import ATMMachine.Atmproject.Models.Person;
import ATMMachine.Atmproject.Repositories.PersonRepository;
import ATMMachine.Atmproject.Services.PersonService;
import org.aspectj.weaver.patterns.PerObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atm/persons/v0")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;
    @GetMapping
    public ResponseEntity<List<Person>> getAllPerson() {
        List<Person> person = personRepository.findAll();
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Person>save(@RequestBody Person person)
    {
        Person person1=personRepository.save(person);
        return ResponseEntity.ok(person1);
    }




}
