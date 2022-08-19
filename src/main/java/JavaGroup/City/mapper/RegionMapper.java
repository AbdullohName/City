package JavaGroup.City.mapper;

import JavaGroup.City.dto.RegionDto;
import JavaGroup.City.entity.Region;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RegionMapper {
    RegionDto toDto(Region region);
    Region toEntity(RegionDto regionDto);
}
