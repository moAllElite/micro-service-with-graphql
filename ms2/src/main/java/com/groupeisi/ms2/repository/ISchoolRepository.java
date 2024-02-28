package com.groupeisi.ms2.repository;

import com.groupeisi.ms2.domain.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISchoolRepository extends JpaRepository<School,Long> {
}
