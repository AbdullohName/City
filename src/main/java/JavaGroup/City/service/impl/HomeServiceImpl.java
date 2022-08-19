package JavaGroup.City.service.impl;

import JavaGroup.City.dto.HomeDto;
import JavaGroup.City.dto.HumanDto;
import JavaGroup.City.dto.ResponseDto;
import JavaGroup.City.mapper.HomeMapper;
import JavaGroup.City.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor

public class HomeServiceImpl implements HomeService {

    private final HomeMapper homeMapper;

    @Override
    public ResponseDto<List<HomeDto>> getAll() {
        return null;
    }

    @Override
    public ResponseDto<List<HumanDto>> getAllByHome() {
        return null;
    }

    @Override
    public ResponseDto addHome(HomeDto homeDto) {
        return null;
    }
}
