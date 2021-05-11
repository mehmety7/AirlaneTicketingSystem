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


@Table(name = "Flight")
@Entity
public class Flight {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fid")
	private Long fid; 
	
	@Column(name = "dtime")
	private String dtime; 
	
	@Column(name = "atime")
	private String atime; 
	
	@Column(name = "duration")
	private int duration;
	
	@Column(name = "capacity")
	private int capacity;
	
	@Column(name = "available")
	private int available = -1;
	
	@Column(name = "price")
	private Double price;
	
	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="rid")
    private Route route;
	
	@OneToOne(mappedBy="flight")  
    private Company company;
	
	@OneToOne(mappedBy = "flight")
	private Ticket ticket;
	
	public Flight() {}
	
	public Flight(String dtime, String atime, int duration, int capacity, int available, Double price, Ticket ticket, Route route) {
		super();
		this.dtime = dtime;
		this.atime = atime;
		this.duration = duration;
		this.capacity = capacity;
		this.available = available;
		this.price = price;
		this.ticket = ticket;
		this.route = route;
		
		/*if(this.ticket.buyOrCancelTicket())
			this.setAvailable(this.available-1);
		else
			this.setAvailable(this.available+1);*/
		
		manipulatePrice();
	}
	
	public void manipulatePrice() {
		int occupancyPercent = (int) (this.available/this.capacity * 100);
		int factor = (int) (occupancyPercent/10);
		Double new_price = this.price + (this.price*10*factor/100.0); 
		this.setPrice(new_price);
	}

	public Long getFid() {
		return fid;
	}

	public void setFid(Long fid) {
		this.fid = fid;
	}

	public String getDtime() {
		return dtime;
	}

	public void setDtime(String dtime) {
		this.dtime = dtime;
	}

	public String getAtime() {
		return atime;
	}

	public void setAtime(String atime) {
		this.atime = atime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getAvailable() {
		if(available == -1)
			return capacity;
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}
	
	
	
	
}
