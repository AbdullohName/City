package JavaGroup.City.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HumanDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String passwordId;
}
