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

import com.project.StudyCase.entity.Passenger;
import com.project.StudyCase.service.PassengerService;
 
/**
 * @author Mehmet
 *
 */
@RestController
public class PassengerRestController {

	 @Autowired
	    private PassengerService passengerService;
	 
	    @PostMapping(consumes = "application/json", produces = "application/json", path = "/passenger")
	    public ResponseEntity<Passenger> createPassenger(@RequestBody Passenger passenger) {
	    	passenger.setCcno(passenger.maskingCard());
	        return new ResponseEntity<>(passengerService.createPassenger(passenger), HttpStatus.CREATED);
	    }
	 
	    @PutMapping(consumes = "application/json", produces = "application/json", path = "/passenger")
	    public ResponseEntity<Passenger> updatePassenger(@RequestBody Passenger passenger) {
	        return new ResponseEntity<>(passengerService.updatePassenger(passenger), HttpStatus.CREATED);
	    }
	 
	    @DeleteMapping(produces = "application/json", consumes = "text/plain", path = "/passenger/{pid}")
	    public ResponseEntity<String> deletePassenger(@PathVariable(value = "pid") Long pid) {
	        passengerService.deletePassenger(pid);
	        return new ResponseEntity<>("Passenger with PassengerId : " + pid + " deleted successfully", HttpStatus.OK);
	    }
	 
	    @GetMapping(path = "/passenger/{pid}", produces = "application/json")
	    public ResponseEntity<Passenger> getPassenger(@PathVariable(value = "pid") Long pid) {
	        return new ResponseEntity<>(passengerService.getPassenger(pid), HttpStatus.OK);
	    }
	 
	    @GetMapping(path = "/passengers", produces = "application/json")
	    public ResponseEntity<List<Passenger>> getAllPassengers() {
	        return new ResponseEntity<>(passengerService.getAllPassenger(), HttpStatus.OK);
	    }
}
