package ATMMachine.Atmproject.Controllers;

import ATMMachine.Atmproject.Dto.CardDTO;
import ATMMachine.Atmproject.Models.Card;
import ATMMachine.Atmproject.Models.StateOfCard;
import ATMMachine.Atmproject.Models.TypeCard;
import ATMMachine.Atmproject.Repositories.CardRepository;
import ATMMachine.Atmproject.Repositories.StateOfCardRepository;
import ATMMachine.Atmproject.Repositories.TypeCardRepository;
import ATMMachine.Atmproject.Services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/atm/card/v0")
public class CardController {


    @Autowired
    private CardService cardService;

    @Autowired
    private TypeCardRepository typeCardRepository;
    @GetMapping
    public ResponseEntity<List<CardDTO>> getAllCards() {
        List<CardDTO>cardDTOS=cardService.find();
        return ResponseEntity.ok(cardDTOS);
    }
    @PostMapping
    public ResponseEntity<Card> save(@RequestBody Card card){
        Optional<TypeCard> typeOfCardOptional = typeCardRepository.findById(card.getTypeCard().getId());
        card.setTypeCard(typeOfCardOptional.get());

        Card card1=cardService.generateCard(card);
        return ResponseEntity.noContent().build();
    }

}
