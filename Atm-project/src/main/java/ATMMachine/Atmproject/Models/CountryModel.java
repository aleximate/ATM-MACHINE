package ATMMachine.Atmproject.Models;

import jakarta.persistence.*;

@Entity
@Table(name="Country")
public class CountryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="country_name")
    private String countryName;
}
