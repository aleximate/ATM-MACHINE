package ATMMachine.Atmproject.Services;

import ATMMachine.Atmproject.Models.Card;
import ATMMachine.Atmproject.Repositories.CardRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CardService {
    @Autowired
    private CardRepository cardRepository;
    @Transactional
    public String addCard(Card card){
        String cardNumber= card.getCardNumber();
        Integer codeSecurity=card.getCodeSecurity();
        LocalDate creationDate=card.getCreationDate();
        LocalDate dueDate=card.getDueDate();

        cardRepository.save(card);
        try {
            return "the operation was succesful";
        } catch (Error e) {
            return e.getMessage();
        }
    }
}
