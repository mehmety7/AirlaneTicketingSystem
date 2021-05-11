package com.project.StudyCase.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.StudyCase.entity.Airport;
import com.project.StudyCase.repository.AirportRepository;
import com.project.StudyCase.service.AirportService;
 
/**
 * @author Mehmet
 *
 */
@Service
public class AirportServiceImpl implements AirportService {
	
	@Autowired
    private AirportRepository airportRepository;
 
    @Override
    public Airport createAirport(Airport airport) {
        return airportRepository.save(airport);
    }
 
    @Override
    public Airport updateAirport(Airport airport) {
        return airportRepository.save(airport);
    }
 
    @Override
    public Airport getAirport(Long aid) {
        Optional<Airport> optionalEmp = airportRepository.findById(aid);
        if (optionalEmp.isPresent()) {
            return optionalEmp.get();
        }
        return null;
    }
 
    @Override
    public void deleteAirport(Long aid) {
        airportRepository.deleteById(aid);
    }
 
    @Override
    public List<Airport> getAllAirport() {
        return airportRepository.findAll();
    }
}
