package com.groupeisi.ms1.mappers;

import com.groupeisi.ms1.domain.Teacher;
import com.groupeisi.ms1.dto.TeacherDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses ={Teacher.class})
public interface TeacherMapper {
    Teacher toTeacherEntity(TeacherDto teacherDto);
    TeacherDto toTeacherDto(Teacher teacher);
}
