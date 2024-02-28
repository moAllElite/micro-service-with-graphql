package com.groupeisi.ms2.controlller;

import com.groupeisi.ms2.domain.FullResponseSchool;
import com.groupeisi.ms2.dto.SchoolDto;
import com.groupeisi.ms2.service.ISchoolService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/schools")
@RestController
public class SchoolController {
    private final ISchoolService schoolService;
    @GetMapping()
    public ResponseEntity<List<SchoolDto>> getAll(){
        return ResponseEntity.ok(schoolService.findAll());
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save( @Valid @RequestBody SchoolDto schoolDto){
        schoolService.save(schoolDto);
    }

    @GetMapping("/ms2")
    public ResponseEntity<String> getMs2(){
        return ResponseEntity.ok("je suis ms2");
    }
    @GetMapping("/with-teachers/{school-id}")
    public ResponseEntity<FullResponseSchool> getSchoolsWithTeacher(@PathVariable(name="school-id")  Long schoolId){
        return ResponseEntity.ok(schoolService.getSchoolsWithTeacher(schoolId));
    }
}
