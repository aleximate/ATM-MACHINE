package ATMMachine.Atmproject.Models;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

@Entity
@Getter
@Setter
@Table(name = "Card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "code_security")
    private String codeSecurity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_type_card")
    private TypeCard typeCard;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_state_card")
    private StateOfCard stateOfCard;

    @Temporal(TemporalType.DATE)
    @Column(name = "creation_date")
    private LocalDate creationDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "due_date")
    private LocalDate dueDate;

    public Card(String cardNumber, String codeSecurity, TypeCard typeCard, StateOfCard stateOfCard, LocalDate creationDate, LocalDate dueDate) {
        this.cardNumber = cardNumber;
        this.codeSecurity = codeSecurity;
        this.typeCard = typeCard;
        this.stateOfCard = stateOfCard;
        this.creationDate = creationDate;
        this.dueDate = dueDate;
    }

    public Card() {

    }
}
