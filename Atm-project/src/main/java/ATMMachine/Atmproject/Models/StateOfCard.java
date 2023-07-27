package ATMMachine.Atmproject.Models;

import jakarta.persistence.*;

@Entity
@Table(name="State_Card")
public class StateOfCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "state_card_name")
    private String stateCardName;

}
