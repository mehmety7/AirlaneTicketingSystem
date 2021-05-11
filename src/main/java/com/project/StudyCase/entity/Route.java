package com.project.StudyCase.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import com.project.StudyCase.wrapper.RouteDTO;

@Table(name = "Route")
@Entity
public class Route {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rid")
	private Long rid;
	
    @Column(name = "fromLoc")
	private String fromLoc;
    
    @Column(name = "toLoc")
	private String toLoc;
    
    @Column(name = "transfer_point")
	private String transferPoint;
    
    @OneToOne(mappedBy="route")  
    private Flight flight; 
	
	public Route() {}	

	public Route(String fromLoc, String toLoc, String transferPoint, Flight flight) {
		super();
		this.fromLoc = fromLoc;
		this.toLoc = toLoc;
		this.transferPoint = transferPoint;
		this.flight = flight;
	}

	public Long getRid() {
		return rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}

	public String getFromLoc() {
		return fromLoc;
	}

	public void setFromLoc(String fromLoc) {
		this.fromLoc = fromLoc;
	}

	public String getToLoc() {
		return toLoc;
	}

	public void setToLoc(String toLoc) {
		this.toLoc = toLoc;
	}
	
	public String getTransferPoint() {
		return transferPoint;
	}

	public void setTransferPoint(String transferPoint) {
		this.transferPoint = transferPoint;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	
	
	
	/*public Route(RouteDTO routeDTO) {
		this.setRid(routeDTO.getRid());
		this.setFromLoc(routeDTO.getFromLoc());
		this.setToLoc(routeDTO.getToLoc());
		this.setTransferPoint(routeDTO.getTransferPoint());
	}*/
	
}
