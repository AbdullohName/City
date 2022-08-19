package JavaGroup.City.mapper;

import JavaGroup.City.dto.HomeDto;
import JavaGroup.City.dto.HumanDto;
import JavaGroup.City.entity.Home;
import JavaGroup.City.entity.Human;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HumanMapper {
    Human toEntity(HumanDto humanDto);
    HumanDto toDto(Human human);
}
