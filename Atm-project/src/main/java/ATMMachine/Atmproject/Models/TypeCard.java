package ATMMachine.Atmproject.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "Type_of_Card")
public class TypeCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name="type_name")
    private String typeName;

}
