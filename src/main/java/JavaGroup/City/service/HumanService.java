package JavaGroup.City.service;

import JavaGroup.City.dto.HomeDto;
import JavaGroup.City.dto.HumanDto;
import JavaGroup.City.dto.ResponseDto;

import java.util.List;

public interface HumanService {
    ResponseDto<List<HumanDto>> getAll();
    ResponseDto addHuman(HumanDto humanDto);
}
