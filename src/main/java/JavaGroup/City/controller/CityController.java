package JavaGroup.City.controller;

import JavaGroup.City.dto.CityDto;
import JavaGroup.City.dto.ResponseDto;
import JavaGroup.City.service.impl.CityServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/City")
@RequiredArgsConstructor
public class CityController {

    private final CityServiceImpl cityService;
    @GetMapping
    public ResponseDto<List<CityDto>> getAll() {
        return cityService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseDto getById(@PathVariable Integer id) {
        return cityService.getById(id);
    }

    @PostMapping("/add")
    public ResponseDto add(@RequestBody CityDto cityDto) {
        return cityService.addCity(cityDto);
    }
}
