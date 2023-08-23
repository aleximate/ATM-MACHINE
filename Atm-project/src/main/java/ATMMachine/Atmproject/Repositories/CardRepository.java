package ATMMachine.Atmproject.Repositories;

import ATMMachine.Atmproject.Dto.CardDTO;
import ATMMachine.Atmproject.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
    @Query(value =
               """    
               SELECT new ATMMachine.Atmproject.Dto.CardDTO(
               c.id,
               c.cardNumber,
               c.codeSecurity,
               NEW ATMMachine.Atmproject.Dto.StateOfCardDTO(sc.id, sc.stateCardName),
               NEW ATMMachine.Atmproject.Dto.TypeCardDTO(tc.id, tc.typeName),
               c.creationDate,
               c.dueDate
               )
               FROM Card c
               INNER JOIN c.stateOfCard sc
               INNER JOIN c.typeCard tc     
               """)
    public List<CardDTO> search();

}
