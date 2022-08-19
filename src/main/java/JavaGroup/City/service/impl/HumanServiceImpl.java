package JavaGroup.City.service.impl;

import JavaGroup.City.dto.HumanDto;
import JavaGroup.City.dto.ResponseDto;
import JavaGroup.City.service.HumanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class HumanServiceImpl implements HumanService {

    @Override
    public ResponseDto<List<HumanDto>> getAll() {
        return null;
    }

    @Override
    public ResponseDto addHuman(HumanDto humanDto) {
        return null;
    }
}
