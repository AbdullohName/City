package JavaGroup.City.service;

import JavaGroup.City.dto.CityDto;
import JavaGroup.City.dto.RegionDto;
import JavaGroup.City.dto.ResponseDto;

import java.util.List;

public interface CityService {
    ResponseDto<List<CityDto>> getAll();

    ResponseDto<List<RegionDto>> getRegionByCity();
    ResponseDto getById(Integer id);
    ResponseDto addCity(CityDto cityDto);
}
