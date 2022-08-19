package JavaGroup.City.service;

import JavaGroup.City.dto.*;

import java.util.List;

public interface DistrictService {
    ResponseDto<List<DistrictDto>> getAll();


    ResponseDto<List<HomeDto>> getRegionByCity();
    ResponseDto addDistrict(DistrictDto districtDto);

}
