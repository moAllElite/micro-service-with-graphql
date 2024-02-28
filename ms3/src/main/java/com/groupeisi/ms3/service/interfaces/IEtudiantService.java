package com.groupeisi.ms3.service.interfaces;

import com.groupeisi.ms3.domain.Student;

import java.util.List;

public interface IEtudiantService {
    List<Student> findAll();
    void save(Student etudiant);
    Integer countEtudiants();
}
