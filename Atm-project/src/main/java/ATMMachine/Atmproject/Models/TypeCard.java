package ATMMachine.Atmproject.Models;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
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
    }
    public TypeCard(Long id) {
        this.id = id;
    }


}
