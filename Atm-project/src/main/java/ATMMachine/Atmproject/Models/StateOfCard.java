package ATMMachine.Atmproject.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="State_Card")
public class StateOfCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_state_card")
    private Long id;
    @Column(name = "state_card_name")
    private String stateCardName;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "stateOfCard")
    private List<Card> cards;


    public StateOfCard() {
        cards= new ArrayList<Card>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStateCardName() {
        return stateCardName;
    }

    public void setStateCardName(String stateCardName) {
        this.stateCardName = stateCardName;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
