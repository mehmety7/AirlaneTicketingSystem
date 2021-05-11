package com.project.StudyCase.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Table(name = "Ticket")
@Entity
public class Ticket {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tid")
	private Long tid; 
	
	@Column(name = "status")
	private Boolean status = true;  // it's false then it is cancelled

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passenger_id", referencedColumnName = "pid")
    private Passenger passenger;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "flight_id", referencedColumnName = "fid")
    private Flight flight;
	
	public Ticket () {}
	
	public Ticket(Boolean status, Passenger passenger, Flight flight) {
		super();
		this.status = status;
		if(this.getPassenger() != null)
			this.passenger = passenger;
		if(this.getFlight() != null)
			this.flight = flight;
	}

	public boolean buyOrCancelTicket() {
		return this.status;
	}

	public Long getTid() {
		return tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
}
