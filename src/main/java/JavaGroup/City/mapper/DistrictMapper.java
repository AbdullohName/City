package JavaGroup.City.mapper;

import JavaGroup.City.dto.DistrictDto;
import JavaGroup.City.entity.District;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DistrictMapper {
    District toEntity(DistrictDto districtDto);
    DistrictDto toDto(District district);
}
