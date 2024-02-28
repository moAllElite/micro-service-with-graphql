package com.groupeisi.ms1.controller;

import com.groupeisi.ms1.dto.TeacherDto;
import com.groupeisi.ms1.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/teachers")
@RequiredArgsConstructor
public class TeacherController {
    private  final TeacherService teacherService;


    @GetMapping
    public ResponseEntity<List<TeacherDto>> getTeachers(){
        return ResponseEntity.ok(teacherService.findAll());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void createTeacher(@RequestBody TeacherDto teacherDto) {
        teacherService.save(teacherDto);
    }
    @GetMapping("/ms1")
    public ResponseEntity<String> getTeachersMs1(){
        return ResponseEntity.ok("je suis ms1");
    }

    @GetMapping("/school/{school-id}")
    public ResponseEntity<List<TeacherDto>> findAllTeacherBySchoolId(
            @PathVariable("school-id") Long schoolId
    ) {
        return ResponseEntity.ok(teacherService.findAllTeacherBySchoolId(schoolId));
    }
}
