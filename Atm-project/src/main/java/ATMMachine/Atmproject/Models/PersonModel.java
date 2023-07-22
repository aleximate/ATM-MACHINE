package ATMMachine.Atmproject.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "Persons")
public class PersonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "dni")
    private Long dni;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name="email")
    private String email;
    @Column(name="cell_phone")
    private Long cellPhone;

}
