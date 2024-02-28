package com.groupeisi.ms1.controller;

import com.groupeisi.ms1.dto.StudentDto;
import com.groupeisi.ms1.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private  final StudentService studentService;


    @GetMapping
    public ResponseEntity<List<StudentDto>> getStudents(){
        return ResponseEntity.ok(studentService.findAll());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void createStudent(@RequestBody StudentDto studentDto) {
        studentService.save(studentDto);
    }
    @GetMapping("/ms1")
    public ResponseEntity<String> getStudentsMs1(){
        return ResponseEntity.ok("je suis ms1");
    }

    @GetMapping("/school/{school-id}")
    public ResponseEntity<List<StudentDto>> findAllStudentBySchoolId(
            @PathVariable("school-id") Long schoolId
    ) {
        return ResponseEntity.ok(studentService.findAllStudentBySchoolId(schoolId));
    }
}
