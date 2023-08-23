package ATMMachine.Atmproject.Models;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "State_Card")
public class StateOfCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_state_card")
    private Long id;
    @Column(name = "state_card_name")
    private String stateCardName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "stateOfCard")
    private List<Card> cards;

    public StateOfCard() {
    }
}
