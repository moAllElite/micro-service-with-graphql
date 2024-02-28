package com.groupeisi.ms3.service.impl;

import com.groupeisi.ms3.domain.Student;
import com.groupeisi.ms3.repository.StudentRepository;
import com.groupeisi.ms3.service.interfaces.IEtudiantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EtudiantServiceImpl implements IEtudiantService {
    private final StudentRepository repository;
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
        return  repository.findAll().size();
    }
}
