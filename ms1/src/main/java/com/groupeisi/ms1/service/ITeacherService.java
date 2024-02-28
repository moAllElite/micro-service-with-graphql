package com.groupeisi.ms1.service;

import com.groupeisi.ms1.dto.TeacherDto;

import java.util.List;

public interface ITeacherService {
    Long save(TeacherDto teacherDto);
    List<TeacherDto> findAll();

    List<TeacherDto> findAllTeacherBySchoolId(Long schoolId);
}
