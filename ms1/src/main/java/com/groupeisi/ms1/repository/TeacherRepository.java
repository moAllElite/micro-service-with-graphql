package com.groupeisi.ms1.repository;

import com.groupeisi.ms1.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    List<Teacher> findAllBySchoolId(Long schoolId);
}
