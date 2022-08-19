package JavaGroup.City.dto;

import JavaGroup.City.entity.District;
import JavaGroup.City.entity.Region;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegionDto {
    private Integer id;
    private String name;
    private List<District> districtList;
}
