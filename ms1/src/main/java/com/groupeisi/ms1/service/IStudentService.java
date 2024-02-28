package com.groupeisi.ms1.service;

import com.groupeisi.ms1.dto.StudentDto;

import java.util.List;

public interface IStudentService {
    Long save(StudentDto studentDto);
    List<StudentDto> findAll();

    List<StudentDto> findAllStudentBySchoolId(Long schoolId);
}
