package com.groupeisi.ms1.service;

import com.groupeisi.ms1.dto.StudentDto;
import com.groupeisi.ms1.mappers.StuddentMapper;
import com.groupeisi.ms1.repository.StudentRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentService implements IStudentService{
    private final StudentRepository studentRepository;
    private final StuddentMapper mapper;


    @Override
    public Long save(@RequestBody @Valid StudentDto studentDto) {
         return studentRepository.save(
                mapper.toStudentEntity(studentDto)
        ).getId();
    }

    @Override
    public List<StudentDto> findAll() {
        return  studentRepository.findAll()
                .stream()
                .map(mapper::toStudentDto)
                .toList();
    }

    @Override
    public List<StudentDto> findAllStudentBySchoolId(Long schoolId) {
        return studentRepository.findAllBySchoolId(schoolId)
                .stream()
                .map(mapper::toStudentDto)
                .toList();
    }
}
