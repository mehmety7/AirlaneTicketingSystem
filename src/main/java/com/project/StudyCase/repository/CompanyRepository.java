package com.project.StudyCase.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.project.StudyCase.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long>{
 
}
