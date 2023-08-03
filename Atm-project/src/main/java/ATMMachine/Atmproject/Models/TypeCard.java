package ATMMachine.Atmproject.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Type_of_Card")
public class TypeCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_card")
    private Long id;
    @Column(name="type_name")
    private String typeName;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "typeCard")
    private List<Card> cards;

    public TypeCard() {
        cards=new ArrayList<Card>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
