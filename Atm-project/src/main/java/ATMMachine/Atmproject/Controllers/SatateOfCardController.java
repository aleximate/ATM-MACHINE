package ATMMachine.Atmproject.Controllers;

import ATMMachine.Atmproject.Models.Card;
import ATMMachine.Atmproject.Models.StateOfCard;
import ATMMachine.Atmproject.Repositories.StateOfCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/atm/state/v0")
public class SatateOfCardController {
    @Autowired
    public StateOfCardRepository stateOfCardRepository;
    @GetMapping
    public ResponseEntity<List<StateOfCard>> getAllStateOfCards() {
        List<StateOfCard> stateOfCards = stateOfCardRepository.findAll();
        return new ResponseEntity<>(stateOfCards, HttpStatus.OK);
    }
}
