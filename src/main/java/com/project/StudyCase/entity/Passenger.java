package com.project.StudyCase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import com.project.StudyCase.wrapper.PassengerDTO;

@Table(name = "Passenger")
@Entity
public class Passenger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pid")
	private Long pid;
	
	@Column(name = "fname")
	private String fname;
	
	@Column(name = "lname")
	private String lname;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "telNo")
	private String telNo;
	
	@Column(name = "mail")
	private String mail;
	
	@Column(name = "ccno")
	private String ccno;

	@OneToOne(mappedBy = "passenger")
	private Ticket ticket;
	
	public Passenger() {}
		
	public Passenger(String fname, String lname, String address, String telNo, String mail, String ccno, Ticket ticket) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.telNo = telNo;
		this.mail = mail;
		this.ccno = ccno;
		if(this.getTicket() != null)
			this.ticket = ticket;
		// this.cards = cards;
	}
	
	public String maskingCard() {
		String masked = "";
		String temp = this.getCcno();
		int counter = 1;
		for(int i = 0; i < temp.length(); i++) {
			if(isNumber(temp.charAt(i))) {
				if (counter < 7 || counter > 12 )
					masked += temp.charAt(i);
				else
					masked += "*";
				counter++;
			}else
				continue;
		}
		return masked;
	}
	
	public boolean isNumber(char letter) {
		int value;
		String s=String.valueOf(letter);  
		try {
	        value = Integer.parseInt(s);
	        return true;
	    } catch (NumberFormatException e) {}
	    return false;
	}
	
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getCcno() {
		return ccno;
	}

	public void setCcno(String ccno) {
		this.ccno = ccno;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	
	
	/*public Passenger(PassengerDTO passdto) {
		this.setPid(passdto.getPid());
		this.setFname(passdto.getFname());
		this.setLname(passdto.getLname());
		this.setAddress(passdto.getAddress());
		this.setTelNo(passdto.getTelNo());
		this.setMail(passdto.getMail());
		this.setCcno(passdto.getCcno());
		
		
		if (passdto.getCards() != null && !passdto.getCards().isEmpty()) 
		{
			this.cards = passdto.getCards().stream().map(Card::new).collect(Collectors.toList());
		} 
	}*/
	
}
