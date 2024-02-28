package com.groupeisi.ms2.service;

import com.groupeisi.ms2.clients.TeacherClient;
import com.groupeisi.ms2.domain.FullResponseSchool;
import com.groupeisi.ms2.dto.SchoolDto;
import com.groupeisi.ms2.mapping.SchoolMapping;
import com.groupeisi.ms2.repository.ISchoolRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@RequiredArgsConstructor
@Service
public class SchoolServiceImpl implements ISchoolService{
    private final ISchoolRepository repository;
    private final   SchoolMapping mapper;
    private final TeacherClient studentClient;


    @Override
    public Long save(SchoolDto schoolDto) {
        return repository.save(
                mapper.toSchoolEntity(schoolDto)
        ).getId();
    }

    @Override
    public List<SchoolDto> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toSchoolDto)
                .toList();
    }

    @Override
    public FullResponseSchool getSchoolsWithTeacher(Long schoolId) {
        var school = repository.findById(schoolId)
                .orElseThrow(
                        ()->new EntityNotFoundException("No school was found")
                );
        var students = studentClient.findAllTeacherBySchoolId(schoolId);
        return FullResponseSchool
                .builder()
                .fullName(school.getName())
                .adress(school.getAddress())
                .teachers(students)
                .build();
    }
}
