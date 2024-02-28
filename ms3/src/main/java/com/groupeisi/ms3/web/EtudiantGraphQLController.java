package com.groupeisi.ms3.web;

import com.groupeisi.ms3.domain.Student;
import com.groupeisi.ms3.service.impl.EtudiantServiceImpl;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@Controller
public class EtudiantGraphQLController {
    public EtudiantGraphQLController(EtudiantServiceImpl etudiantService) {
        this.etudiantService = etudiantService;
    }

    private  final   EtudiantServiceImpl etudiantService;


    @ResponseStatus(HttpStatus.CREATED)
    @Transactional
    @PostMapping
    public void save(
            @Valid
    @RequestBody Student etudiant
    ) {
        etudiantService.save(etudiant);
    }


    @QueryMapping
    public List<Student> studentList() {
        return etudiantService.findAll();
    }
    @QueryMapping
    public Integer countEtudiants (
    ) {
        return etudiantService.countEtudiants();
    }
}
