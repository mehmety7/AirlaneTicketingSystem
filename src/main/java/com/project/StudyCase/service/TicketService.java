package com.project.StudyCase.service;

import java.util.List;

import com.project.StudyCase.entity.Ticket;
 
/**
 * @author Mehmet
 *
 */
public interface TicketService {
	
	public Ticket createTicket(Ticket ticket);
    public Ticket updateTicket(Ticket ticket);
    public Ticket getTicket(Long tid);
    public void deleteTicket(Long tid);
    public List<Ticket> getAllTicket();
    
    
}
