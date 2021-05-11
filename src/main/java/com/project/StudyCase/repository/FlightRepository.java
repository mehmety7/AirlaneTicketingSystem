package com.project.StudyCase.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.project.StudyCase.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

}
