package com.project.StudyCase.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.project.StudyCase.entity.Airport;
 
@Repository
public interface AirportRepository extends JpaRepository<Airport,Long>{
 
}