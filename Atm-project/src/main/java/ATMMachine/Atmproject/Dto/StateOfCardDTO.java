package ATMMachine.Atmproject.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StateOfCardDTO {
    private Long id;
    private String stateName;
}
