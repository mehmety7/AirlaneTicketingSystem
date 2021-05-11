package com.project.StudyCase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.StudyCase.entity.Airport;
import com.project.StudyCase.service.AirportService;
 
/**
 * @author Mehmet
 *
 */
@RestController
public class AirportRestController {

	 @Autowired
	    private AirportService airportService;
	 
	    @PostMapping(consumes = "application/json", produces = "application/json", path = "/airport")
	    public ResponseEntity<Airport> createAirport(@RequestBody Airport airport) {
	        return new ResponseEntity<>(airportService.createAirport(airport), HttpStatus.CREATED);
	    }
	 
	    @PutMapping(consumes = "application/json", produces = "application/json", path = "/airport")
	    public ResponseEntity<Airport> updateAirport(@RequestBody Airport airport) {
	        return new ResponseEntity<>(airportService.updateAirport(airport), HttpStatus.CREATED);
	    }
	 
	    @DeleteMapping(produces = "application/json", consumes = "text/plain", path = "/airport/{aid}")
	    public ResponseEntity<String> deleteAirport(@PathVariable(value = "aid") Long aid) {
	        airportService.deleteAirport(aid);
	        return new ResponseEntity<>("Airport with AirportId : " + aid + " deleted successfully", HttpStatus.OK);
	    }
	 
	    @GetMapping(path = "/airport/{aid}", produces = "application/json")
	    public ResponseEntity<Airport> getAirport(@PathVariable(value = "aid") Long aid) {
	        return new ResponseEntity<>(airportService.getAirport(aid), HttpStatus.OK);
	    }
	 
	    @GetMapping(path = "/airports", produces = "application/json")
	    public ResponseEntity<List<Airport>> getAllAirports() {
	        return new ResponseEntity<>(airportService.getAllAirport(), HttpStatus.OK);
	    }
}
