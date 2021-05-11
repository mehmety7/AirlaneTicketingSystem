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

//import com.project.StudyCase.wrapper.CompanyDTO;

@Table(name = "Company")
@Entity
public class Company {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid")
	private Long cid;
	
	@Column(name = "name")
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="fid")
    private Flight flight;
	
	public Company() {}
	
	public Company(String name) {
		super();
		this.name = name;

	}

	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
	/*public Company(CompanyDTO company) {
		this.cid = company.getCid();
		this.name = company.getName();
	}*/
}
