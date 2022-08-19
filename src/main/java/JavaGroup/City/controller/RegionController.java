package JavaGroup.City.controller;

import JavaGroup.City.dto.DistrictDto;
import JavaGroup.City.dto.RegionDto;
import JavaGroup.City.dto.ResponseDto;
import JavaGroup.City.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Region")
@RequiredArgsConstructor
public class RegionController {
    private final RegionService regionService;
    @GetMapping("/get")
    public ResponseDto<List<RegionDto>> getAll() {
        return regionService.getAll();
    }

    public ResponseDto<List<DistrictDto>> getAllDistrictByRegion() {
        return regionService.getAllDistrictByRegion();
    }

    @PostMapping("/add")
    public ResponseDto addRegion(@RequestBody RegionDto regionDto) {
        return regionService.addRegion(regionDto);
    }
}
