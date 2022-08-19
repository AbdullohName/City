package JavaGroup.City.service;

import JavaGroup.City.dto.CityDto;
import JavaGroup.City.dto.HomeDto;
import JavaGroup.City.dto.HumanDto;
import JavaGroup.City.dto.ResponseDto;

import java.util.List;

public interface HomeService {
    ResponseDto<List<HomeDto>> getAll();
    ResponseDto<List<HumanDto>> getAllByHome();
    ResponseDto addHome(HomeDto homeDto);
}
