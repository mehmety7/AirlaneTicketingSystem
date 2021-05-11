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

import com.project.StudyCase.entity.Flight;
import com.project.StudyCase.service.FlightService;
 
/**
 * @author Mehmet
 *
 */
@RestController
public class FlightRestController {

	 @Autowired
	    private FlightService flightService;
	 
	    @PostMapping(consumes = "application/json", produces = "application/json", path = "/flight")
	    public ResponseEntity<Flight> createFlight(@RequestBody Flight flight) {
	        return new ResponseEntity<>(flightService.createFlight(flight), HttpStatus.CREATED);
	    }
	 
	    @PutMapping(consumes = "application/json", produces = "application/json", path = "/flight")
	    public ResponseEntity<Flight> updateFlight(@RequestBody Flight flight) {
	        return new ResponseEntity<>(flightService.updateFlight(flight), HttpStatus.CREATED);
	    }
	 
	    @DeleteMapping(produces = "application/json", consumes = "text/plain", path = "/flight/{fid}")
	    public ResponseEntity<String> deleteFlight(@PathVariable(value = "fid") Long fid) {
	        flightService.deleteFlight(fid);
	        return new ResponseEntity<>("Flight with FlightId : " + fid + " deleted successfully", HttpStatus.OK);
	    }
	 
	    @GetMapping(path = "/flight/{fid}", produces = "application/json")
	    public ResponseEntity<Flight> getFlight(@PathVariable(value = "fid") Long fid) {
	        return new ResponseEntity<>(flightService.getFlight(fid), HttpStatus.OK);
	    }
	 
	    @GetMapping(path = "/flights", produces = "application/json")
	    public ResponseEntity<List<Flight>> getAllFlights() {
	        return new ResponseEntity<>(flightService.getAllFlight(), HttpStatus.OK);
	    }
}
