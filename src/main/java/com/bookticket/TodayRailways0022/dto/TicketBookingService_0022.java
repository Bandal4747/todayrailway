package com.bookticket.TodayRailways0022.dto;

import java.util.List;

import com.bookticket.TodayRailways0022.entity.TicketBooking_0022;


public interface TicketBookingService_0022 {
	
	public TicketBooking_0022 getTicketById(int ticketId);
	public List<TicketBooking_0022> getAllTicketInfo();
	public boolean creatNewTicket(TicketBooking_0022 objBooking);
}
