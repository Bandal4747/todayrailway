package com.bookticket.TodayRailways0022.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookticket.TodayRailways0022.entity.TicketBooking_0022;
import com.bookticket.TodayRailways0022.repositroy.TicketBookingRepo_0022;
@Service
public class TicketbookingServiceImp_0022 implements TicketBookingService_0022 {

	@Autowired
	TicketBookingRepo_0022 repo;
	@Override
	public TicketBooking_0022 getTicketById(int ticketId) {
		TicketBooking_0022 objBooking=repo.findById(ticketId).get();
		return objBooking;
	}
	@Override
	public List<TicketBooking_0022> getAllTicketInfo() {
		
		return repo.findallId();
	}
	@Override
	public boolean creatNewTicket(TicketBooking_0022 objBooking) {
		repo.save(objBooking);
		return true;
	}

}
