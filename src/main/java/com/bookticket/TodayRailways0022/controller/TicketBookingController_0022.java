package com.bookticket.TodayRailways0022.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookticket.TodayRailways0022.dto.TicketBookingService_0022;
import com.bookticket.TodayRailways0022.entity.TicketBooking_0022;

@RestController
public class TicketBookingController_0022 {
	@Autowired 
	TicketBookingService_0022 objTicketService;
	@GetMapping("all2")
	public List<TicketBooking_0022> allTicket(){
		return objTicketService.getAllTicketInfo();
	}
	
	@PostMapping("book")
	public  boolean newTicket(@RequestBody TicketBooking_0022 objBooking) {
		return objTicketService.creatNewTicket(objBooking);
	}
	
	@GetMapping("ticketid")
	public TicketBooking_0022 ticketById(@RequestParam(name="ticketId")int ticketId) {
		return objTicketService.getTicketById(ticketId);
	}

}
