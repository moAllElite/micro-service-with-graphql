package com.groupeisi.ms1.mappers;

import com.groupeisi.ms1.domain.Student;
import com.groupeisi.ms1.dto.StudentDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses ={Student.class})
public interface StuddentMapper {
    Student toStudentEntity(StudentDto studentDto);
    StudentDto toStudentDto(Student student);
}
