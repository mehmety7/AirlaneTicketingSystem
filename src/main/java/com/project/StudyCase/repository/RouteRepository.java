package com.project.StudyCase.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.project.StudyCase.entity.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {

}
