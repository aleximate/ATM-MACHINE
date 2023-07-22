package ATMMachine.Atmproject.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "States")
public class StateModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "state_name")
    private String stateName;
}
