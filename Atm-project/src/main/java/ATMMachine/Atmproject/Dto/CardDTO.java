package ATMMachine.Atmproject.Dto;

import ATMMachine.Atmproject.Models.StateOfCard;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
public class CardDTO {
    private Long id;
    private String cardNumber;
    private String codeSecurity;
    private StateOfCardDTO stateOfCard;
    private TypeCardDTO typeCard;
    private LocalDate creationDate;
    private LocalDate dueDate;
}
