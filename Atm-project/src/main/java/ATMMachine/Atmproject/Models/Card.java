package ATMMachine.Atmproject.Models;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

@Entity
@Table(name = "Card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name="card_number")
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
    @Column(name="due_date")
    private LocalDate dueDate;

    @PrePersist
    public void Card() {
        this.cardNumber = generatedCardNumber();
        this.codeSecurity=generatedCode();
        this.creationDate=LocalDate.now();
        this.dueDate=this.creationDate.plusYears(3).plusDays(5);
    }
    private String generatedCardNumber(){
        Random random=new Random();
        StringBuilder cardNumber=new StringBuilder();
        for (int i=0; i<15; i++){
            int digit=random.nextInt(10);
            cardNumber.append(digit);
        }
        return cardNumber.toString();
    }
    private String generatedCode(){
        Random ra= new Random();
        StringBuilder codeNumber= new StringBuilder();
        for (int a=0; a<3;a++){
            int code=ra.nextInt(10);
            codeNumber.append(code);
        }
        return codeNumber.toString();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCodeSecurity() {
        return codeSecurity;
    }

    public void setCodeSecurity(String codeSecurity) {
        this.codeSecurity = codeSecurity;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public TypeCard getTypeCard() {
        return typeCard;
    }

    public void setTypeCard(TypeCard typeCard) {
        this.typeCard = typeCard;
    }

    public StateOfCard getStateOfCard() {
        return stateOfCard;
    }

    public void setStateOfCard(StateOfCard stateOfCard) {
        this.stateOfCard = stateOfCard;
    }
}
