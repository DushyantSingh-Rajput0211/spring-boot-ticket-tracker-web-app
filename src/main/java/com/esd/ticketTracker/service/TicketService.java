package com.esd.ticketTracker.service;

import java.util.List;

import com.esd.ticketTracker.dto.TicketDto;

public interface TicketService {
	
	List<TicketDto> findAllTickets();
	
	List<TicketDto> findTicketByUser();
	
	void createTicket(TicketDto ticketDto);
	
	TicketDto findTickerById(Long ticketId);
	
	
	
	void updateTicket(TicketDto ticketDto);
	
	void deleteTicket(Long ticketId);

	TicketDto findTicketByUrl(String ticketUrl);
	
	List<TicketDto> searchTickets(String query);

}
