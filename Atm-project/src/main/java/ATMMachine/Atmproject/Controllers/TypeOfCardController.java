package ATMMachine.Atmproject.Controllers;

import ATMMachine.Atmproject.Models.TypeCard;
import ATMMachine.Atmproject.Repositories.TypeCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/atm/type/v0")
public class TypeOfCardController {
    @Autowired
    private TypeCardRepository typeCardRepository;
    @GetMapping
    public ResponseEntity<List<TypeCard>>getAllTypeOfCard(){
        List<TypeCard> typeCards=typeCardRepository.findAll();
        return new ResponseEntity<>(typeCards, HttpStatus.OK);
    }

}
