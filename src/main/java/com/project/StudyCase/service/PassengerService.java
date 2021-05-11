package com.project.StudyCase.service;

import java.util.List;

import com.project.StudyCase.entity.Passenger;
 
/**
 * @author Mehmet
 *
 */
public interface PassengerService {
	
	public Passenger createPassenger(Passenger passenger);
    public Passenger updatePassenger(Passenger passenger);
    public Passenger getPassenger(Long pid);
    public void deletePassenger(Long pid);
    public List<Passenger> getAllPassenger();
    
    
}
