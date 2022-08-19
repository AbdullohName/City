package JavaGroup.City.dto;

import JavaGroup.City.entity.Home;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DistrictDto {
    private Integer id;
    private String name;
    private List<Home> homeList;


}
