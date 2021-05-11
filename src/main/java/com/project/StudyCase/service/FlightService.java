package com.project.StudyCase.service;

import java.util.List;

import com.project.StudyCase.entity.Flight;
 
/**
 * @author Mehmet
 *
 */
public interface FlightService {
	
	public Flight createFlight(Flight flight);
    public Flight updateFlight(Flight flight);
    public Flight getFlight(Long fid);
    public void deleteFlight(Long fid);
    public List<Flight> getAllFlight();
    
    
}
