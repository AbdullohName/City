package JavaGroup.City.service.impl;

import JavaGroup.City.dto.CityDto;
import JavaGroup.City.dto.RegionDto;
import JavaGroup.City.dto.ResponseDto;
import JavaGroup.City.entity.City;
import JavaGroup.City.entity.Region;
import JavaGroup.City.mapper.CityMapper;
import JavaGroup.City.repository.CityRepository;
import JavaGroup.City.repository.Impl.CityRepositoryImpl;
import JavaGroup.City.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepositories;
    private final CityMapper cityMapper;

    public ResponseDto<List<CityDto>> getAll() {
        List<City> cities = cityRepositories.findAll();
        List<CityDto> cityDto = cities.stream()
                .map(cityMapper::toDto)
                .collect(Collectors.toList());
        return ResponseDto.<List<CityDto>>builder().message("Ok").success(true).data(cityDto).build();
    }

    @Override
    public ResponseDto<List<RegionDto>> getRegionByCity() {
        return null;
    }

    public ResponseDto getById(Integer id) {
        Optional<City> optionalCity = cityRepositories.findById(id);
        if(optionalCity.isEmpty()) {
            return ResponseDto.builder()
                    .code(0)
                    .message("Not Fount")
                    .success(false).build();
        }

        CityDto cityDto = cityMapper.toDto(optionalCity.get());

        return ResponseDto.builder().message("OK").success(true).data(cityDto).build();
    }

    public ResponseDto addCity(CityDto cityDto) {
        cityRepositories.save(cityMapper.toEntity(cityDto));
        return ResponseDto.builder()
                .code(1)
                .success(true)
                .message("success")
                .build();
    }
}
