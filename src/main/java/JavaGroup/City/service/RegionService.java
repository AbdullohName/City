package JavaGroup.City.service;

import JavaGroup.City.dto.CityDto;
import JavaGroup.City.dto.DistrictDto;
import JavaGroup.City.dto.RegionDto;
import JavaGroup.City.dto.ResponseDto;

import java.util.List;

public interface RegionService {
    ResponseDto<List<RegionDto>> getAll();
    ResponseDto<List<DistrictDto>> getAllDistrictByRegion();
    ResponseDto addRegion(RegionDto regionDto);
}
