package com.project.StudyCase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import com.project.StudyCase.wrapper.AirportDTO;

@Table(name = "Airport")
@Entity
public class Airport {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aid")
    private Long aid;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "city")
    private String city;

    public Airport() {}
    
    /*public Airport(AirportDTO airportDTO) {
        this.aid = airportDTO.getAid();
        this.name = airportDTO.getName();
        this.city = airportDTO.getCity();
    }*/

    public Airport(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}