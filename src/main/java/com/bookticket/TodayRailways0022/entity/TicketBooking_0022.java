package com.bookticket.TodayRailways0022.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticketbookigtable_0022")
public class TicketBooking_0022 {
	@Id
	@GeneratedValue(generator="increment")
	@Column(name="ticketid")
	int ticketId;
	@Column(name="username")
	String userName;
	@Column(name="cityfrom")
	String cityFrom;
	@Column(name="cityto")
	String cityTo;
	
	@Column(name="traveldate")
	String travelDate;
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
		public TicketBooking_0022(int ticketId, String userName, String cityFrom, String cityTo, String travelDate) {
			super();
			this.ticketId = ticketId;
			this.userName = userName;
			this.cityFrom = cityFrom;
			this.cityTo = cityTo;
			this.travelDate = travelDate;
		}
public TicketBooking_0022() {
	// TODO Auto-generated constructor stub
}
	public int getTicketId() {
	return ticketId;
}
public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getCityFrom() {
	return cityFrom;
}
public void setCityFrom(String cityFrom) {
	this.cityFrom = cityFrom;
}
public String getCityTo() {
	return cityTo;
}
public void setCityTo(String cityTo) {
	this.cityTo = cityTo;
}
public String getTravelDate() {
	return travelDate;
}


}
