package ATMMachine.Atmproject.Services;

import ATMMachine.Atmproject.Dto.CardDTO;
import ATMMachine.Atmproject.Models.Card;
import ATMMachine.Atmproject.Models.StateOfCard;
import ATMMachine.Atmproject.Models.TypeCard;
import ATMMachine.Atmproject.Repositories.CardRepository;
import ATMMachine.Atmproject.Repositories.StateOfCardRepository;
import ATMMachine.Atmproject.Repositories.TypeCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class CardService {
    @Autowired
    private CardRepository cardRepository;
    @Autowired
    private StateOfCardRepository stateOfCardRepository;
    @Autowired
    private TypeCardRepository typeCardRepository;
    public List<CardDTO>find(){
        return cardRepository.search();
    }

    public Card generateCard(Card card) {
        card.setCardNumber(generatedCardNumber());
        card.setCodeSecurity(generatedCode());
        card.setCreationDate(LocalDate.now());
        card.setDueDate(card.getCreationDate().plusYears(3).plusDays(5));
        StateOfCard initialState = stateOfCardRepository.findById(1L).orElse(null);
        if (initialState != null) {
            card.setStateOfCard(initialState);
        }
        card.setTypeCard(card.getTypeCard());
        cardRepository.save(card);
        return card;
    }
    private String generatedCardNumber() {
        return generateRandomNumberString(15);
    }

    private String generatedCode() {
        return generateRandomNumberString(3);
    }

    private String generateRandomNumberString(int length) {
        StringBuilder result = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            result.append(random.nextInt(10));
        }

        return result.toString();
    }

    public void updateStateAfterDueDate(Card card) {
        LocalDate currentDate = LocalDate.now();
        if (currentDate.isAfter(card.getDueDate())) {
            StateOfCard overdueState = stateOfCardRepository.findById(2L).orElse(null);
            if (overdueState != null) {
                card.setStateOfCard(overdueState);
            }
        }
    }

}
