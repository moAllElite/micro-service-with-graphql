package com.groupeisi.ms2.mapping;

import com.groupeisi.ms2.domain.School;
import com.groupeisi.ms2.dto.SchoolDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses ={School.class})
public interface SchoolMapping {
    School toSchoolEntity(SchoolDto schoolDto);
    SchoolDto toSchoolDto(School school);
}
