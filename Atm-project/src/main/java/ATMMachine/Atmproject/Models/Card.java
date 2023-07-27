package ATMMachine.Atmproject.Models;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

@Entity
@Table(name = "Cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name="card_number")
    private String cardNumber;
    @Column(name = "code_security")
    private int codeSecurity;
    @Temporal(TemporalType.DATE)
    @Column(name = "creation_date")
    private LocalDate creationDate;
    @Temporal(TemporalType.DATE)
    @Column(name="due_date")
    private LocalDate dueDate;
    @PrePersist
    public void Card() {
        this.cardNumber = generatedCardNumber();
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

    public Card(String cardNumber, int codeSecurity, LocalDate creationDate, LocalDate dueDate) {
        this.cardNumber = cardNumber;
        this.codeSecurity = codeSecurity;
        this.creationDate = creationDate;
        this.dueDate = dueDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCodeSecurity() {
        return codeSecurity;
    }

    public void setCodeSecurity(int codeSecurity) {
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
}
