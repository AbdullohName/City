package JavaGroup.City.service.impl;

import JavaGroup.City.dto.DistrictDto;
import JavaGroup.City.dto.HomeDto;
import JavaGroup.City.dto.ResponseDto;
import JavaGroup.City.entity.District;
import JavaGroup.City.mapper.DistrictMapper;
import JavaGroup.City.repository.Impl.DistrictRepositoryImpl;
import JavaGroup.City.service.DistrictService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class DistrictServiceImpl implements DistrictService {
    private final DistrictRepositoryImpl districtRepository;
    private final DistrictMapper districtMapper;

    public ResponseDto<List<DistrictDto>> getAll() {
        List<District> districts = districtRepository.findAll();
        return null;
    }

    @Override
    public ResponseDto<List<HomeDto>> getRegionByCity() {
        return null;
    }

    @Override
    public ResponseDto addDistrict(DistrictDto districtDto) {
        return null;
    }


}
