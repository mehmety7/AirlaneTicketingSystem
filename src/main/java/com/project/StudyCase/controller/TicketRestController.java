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

import com.project.StudyCase.entity.Ticket;
import com.project.StudyCase.service.TicketService;
 
/**
 * @author Mehmet
 *
 */
@RestController
public class TicketRestController {

	 @Autowired
	    private TicketService ticketService;
	 
	    @PostMapping(consumes = "application/json", produces = "application/json", path = "/ticket")
	    public ResponseEntity<Ticket> createTicket(@RequestBody Ticket ticket) {
	        return new ResponseEntity<>(ticketService.createTicket(ticket), HttpStatus.CREATED);
	    }
	 
	    @PutMapping(consumes = "application/json", produces = "application/json", path = "/ticket")
	    public ResponseEntity<Ticket> updateTicket(@RequestBody Ticket ticket) {
	        return new ResponseEntity<>(ticketService.updateTicket(ticket), HttpStatus.CREATED);
	    }
	 
	    @DeleteMapping(produces = "application/json", consumes = "text/plain", path = "/ticket/{tid}")
	    public ResponseEntity<String> deleteTicket(@PathVariable(value = "tid") Long tid) {
	        ticketService.deleteTicket(tid);
	        return new ResponseEntity<>("Ticket with TicketId : " + tid + " deleted successfully", HttpStatus.OK);
	    }
	 
	    @GetMapping(path = "/ticket/{tid}", produces = "application/json")
	    public ResponseEntity<Ticket> getTicket(@PathVariable(value = "tid") Long tid) {
	        return new ResponseEntity<>(ticketService.getTicket(tid), HttpStatus.OK);
	    }
	 
	    @GetMapping(path = "/tickets", produces = "application/json")
	    public ResponseEntity<List<Ticket>> getAllTickets() {
	        return new ResponseEntity<>(ticketService.getAllTicket(), HttpStatus.OK);
	    }
}
