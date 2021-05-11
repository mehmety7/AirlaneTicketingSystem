package com.project.StudyCase.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.StudyCase.entity.Flight;
import com.project.StudyCase.repository.FlightRepository;
import com.project.StudyCase.service.FlightService;
 
/**
 * @author Mehmet
 *
 */
@Service
public class FlightServiceImpl implements FlightService {
	
	@Autowired
    private FlightRepository flightRepository;
 
    @Override
    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }
 
    @Override
    public Flight updateFlight(Flight flight) {
        return flightRepository.save(flight);
    }
 
    @Override
    public Flight getFlight(Long fid) {
        Optional<Flight> optionalEmp = flightRepository.findById(fid);
        if (optionalEmp.isPresent()) {
            return optionalEmp.get();
        }
        return null;
    }
 
    @Override
    public void deleteFlight(Long fid) {
        flightRepository.deleteById(fid);
    }
 
    @Override
    public List<Flight> getAllFlight() {
        return flightRepository.findAll();
    }
}
