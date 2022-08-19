package JavaGroup.City.service.impl;

import JavaGroup.City.dto.DistrictDto;
import JavaGroup.City.dto.RegionDto;
import JavaGroup.City.dto.ResponseDto;
import JavaGroup.City.entity.Region;
import JavaGroup.City.mapper.RegionMapper;
import JavaGroup.City.repository.Impl.RegionRepositoryImpl;
import JavaGroup.City.repository.RegionRepository;
import JavaGroup.City.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
public class RegionServiceImpl implements RegionService{
    private final RegionRepository regionRepository;
    private final RegionMapper regionMapper;

    @Override
    public ResponseDto<List<RegionDto>> getAll() {
        List<Region> regions = regionRepository.findAll();
        List<RegionDto> regionDtoList = regions.stream()
                .map(regionMapper::toDto)
                .collect(Collectors.toList());
        return ResponseDto.<List<RegionDto>>builder().message("OK").success(true).code(1).data(regionDtoList).build();
    }

    @Override
    public ResponseDto<List<DistrictDto>> getAllDistrictByRegion() {
        return null;
    }

    @Override
    public ResponseDto addRegion(RegionDto regionDto) {
        regionRepository.save(regionMapper.toEntity(regionDto));
        return ResponseDto.builder()
                .code(1)
                .success(true)
                .message("success")
                .build();
    }
}
