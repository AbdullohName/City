package JavaGroup.City.dto;

import JavaGroup.City.entity.Human;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HomeDto {
    private Integer id;
    private Integer homeNumber;
    private List<Human> humanList;
}
