package com.groupeisi.ms1.service;

import com.groupeisi.ms1.dto.TeacherDto;
import com.groupeisi.ms1.mappers.TeacherMapper;
import com.groupeisi.ms1.repository.TeacherRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TeacherService implements ITeacherService {
    private final TeacherRepository teacherRepository;
    private final TeacherMapper mapper;


    @Override
    public Long save(@RequestBody @Valid TeacherDto teacherDto) {
         return teacherRepository.save(
                mapper.toTeacherEntity(teacherDto)
        ).getId();
    }

    @Override
    public List<TeacherDto> findAll() {
        return  teacherRepository.findAll()
                .stream()
                .map(mapper::toTeacherDto)
                .toList();
    }

    @Override
    public List<TeacherDto> findAllTeacherBySchoolId(Long schoolId) {
        return teacherRepository.findAllBySchoolId(schoolId)
                .stream()
                .map(mapper::toTeacherDto)
                .toList();
    }
}
