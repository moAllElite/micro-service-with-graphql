package com.groupeisi.ms2.service;

import com.groupeisi.ms2.domain.FullResponseSchool;
import com.groupeisi.ms2.dto.SchoolDto;

import java.util.List;

public interface ISchoolService {
    Long save (SchoolDto schoolDto);
    List<SchoolDto> findAll();

    FullResponseSchool  getSchoolsWithTeacher(Long schoolId);
}
