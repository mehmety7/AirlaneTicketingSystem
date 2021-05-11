package com.project.StudyCase.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.project.StudyCase.entity.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
	
	//public List<Passenger> findByFnameAndLname(String fname, String lname);
	
}
