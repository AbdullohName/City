package JavaGroup.City.mapper;

import JavaGroup.City.dto.HomeDto;
import JavaGroup.City.entity.Home;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HomeMapper {
    Home toEntity(HomeDto homeDto);
    HomeDto toDto(Home home);
}
