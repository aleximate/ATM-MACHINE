package ATMMachine.Atmproject.Models;

import jakarta.persistence.*;

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
    public void Card() {
        this.cardNumber = generatedCardNumber();
    }
    @Column(name = "code_security")
    private int codeSecurity;
    @Column(name = "creation_date")
    private Date creationDate;
    @Column(name="due_date")
    private Date dueDate;
    private String generatedCardNumber(){
        Random random=new Random();
        StringBuilder cardNumber=new StringBuilder();
        for (int i=0; i<15; i++){
            int digite=random.nextInt(10);
            cardNumber.append(digite);
        }
        return cardNumber.toString();
    }
}
