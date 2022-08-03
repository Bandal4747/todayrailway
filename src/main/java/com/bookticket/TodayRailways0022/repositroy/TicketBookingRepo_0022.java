package com.bookticket.TodayRailways0022.repositroy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.bookticket.TodayRailways0022.entity.TicketBooking_0022;
@Repository
public interface TicketBookingRepo_0022 extends JpaRepository<TicketBooking_0022, Integer> {
	
	  @Query("select q from TicketBooking_0022 q") public List<TicketBooking_0022>
	  findallId();
	 
}
