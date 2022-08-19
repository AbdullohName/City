package JavaGroup.City.mapper;

import JavaGroup.City.dto.CityDto;
import JavaGroup.City.entity.City;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CityMapper {
    City toEntity(CityDto cityDto);
    CityDto toDto(City city);
}
