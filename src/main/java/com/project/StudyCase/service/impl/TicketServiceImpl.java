package com.project.StudyCase.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.StudyCase.entity.Ticket;
import com.project.StudyCase.repository.TicketRepository;
import com.project.StudyCase.service.TicketService;
 
/**
 * @author Mehmet
 *
 */
@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired
    private TicketRepository ticketRepository;
 
    @Override
    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
 
    @Override
    public Ticket updateTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
 
    @Override
    public Ticket getTicket(Long tid) {
        Optional<Ticket> optionalEmp = ticketRepository.findById(tid);
        if (optionalEmp.isPresent()) {
            return optionalEmp.get();
        }
        return null;
    }
 
    @Override
    public void deleteTicket(Long tid) {
        ticketRepository.deleteById(tid);
    }
 
    @Override
    public List<Ticket> getAllTicket() {
        return ticketRepository.findAll();
    }
}
