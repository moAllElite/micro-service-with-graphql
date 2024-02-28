package com.groupeisi.ms3.service.impl;

import com.groupeisi.ms3.domain.Student;
import com.groupeisi.ms3.repository.StudentRepository;
import com.groupeisi.ms3.service.interfaces.IStudentService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class StudentServiceImpl implements IStudentService {
    private StudentRepository repository;
    @Override
    public List<Student> findAll() {
        return repository.findAll().stream().toList();

    }

    @Override
    public void save(Student etudiant) {
        repository.save(etudiant);
    }

    @Override
    public Integer countEtudiants() {
        return  repository.findAll()
            .size();
    }
}
