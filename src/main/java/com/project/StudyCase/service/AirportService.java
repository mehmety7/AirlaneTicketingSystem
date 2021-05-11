package com.project.StudyCase.service;

import java.util.List;

import com.project.StudyCase.entity.Airport;
 
/**
 * @author Mehmet
 *
 */
public interface AirportService {
	
	public Airport createAirport(Airport airport);
    public Airport updateAirport(Airport airport);
    public Airport getAirport(Long aid);
    public void deleteAirport(Long aid);
    public List<Airport> getAllAirport();
    
    
}
