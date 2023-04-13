package com.glearning.service;

import java.util.List;

import com.glearning.model.Ticket;

public interface TicketService {
	List<Ticket> fetchAllTicket();

	Ticket getTicketById(int id);

	void saveTicket(Ticket ticket);

	void deleteTicketById(int id);

	List<Ticket> searchAllTicket(String title,String description);
}
