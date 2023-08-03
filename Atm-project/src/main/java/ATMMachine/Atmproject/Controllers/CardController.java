package ATMMachine.Atmproject.Controllers;

import ATMMachine.Atmproject.Models.Card;
import ATMMachine.Atmproject.Models.StateOfCard;
import ATMMachine.Atmproject.Repositories.CardRepository;
import ATMMachine.Atmproject.Repositories.StateOfCardRepository;
import ATMMachine.Atmproject.Repositories.TypeCardRepository;
import ATMMachine.Atmproject.Services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/atm/card/v0")
public class CardController {

    @Autowired
    private CardRepository cardRepository;
    @Autowired
    private StateOfCardRepository stateOfCardRepository;
    @Autowired
    private TypeCardRepository typeCardRepository;

    @PostMapping
    public ResponseEntity<Card> save(@RequestBody Card card){
        Optional<StateOfCard> stateOfCardOptional=stateOfCardRepository.findById(card.getStateOfCard().getId());
        card.setStateOfCard(stateOfCardOptional.get());
        Card card1=cardRepository.save(card);
        return ResponseEntity.noContent().build();
    }
}
