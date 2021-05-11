package com.project.StudyCase.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.StudyCase.entity.Passenger;
import com.project.StudyCase.repository.PassengerRepository;
import com.project.StudyCase.service.PassengerService;
 
/**
 * @author Mehmet
 *
 */
@Service
public class PassengerServiceImpl implements PassengerService {
	
	@Autowired
    private PassengerRepository passengerRepository;
 
    @Override
    public Passenger createPassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }
 
    @Override
    public Passenger updatePassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }
 
    @Override
    public Passenger getPassenger(Long pid) {
        Optional<Passenger> optionalEmp = passengerRepository.findById(pid);
        if (optionalEmp.isPresent()) {
            return optionalEmp.get();
        }
        return null;
    }
 
    @Override
    public void deletePassenger(Long pid) {
        passengerRepository.deleteById(pid);
    }
 
    @Override
    public List<Passenger> getAllPassenger() {
        return passengerRepository.findAll();
    }
}
