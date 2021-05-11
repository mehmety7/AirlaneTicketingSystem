package com.project.StudyCase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.StudyCase.entity.Company;
import com.project.StudyCase.service.CompanyService;
 
/**
 * @author Mehmet
 *
 */
@RestController
public class CompanyRestController {

	 @Autowired
	    private CompanyService companyService;
	 
	    @PostMapping(consumes = "application/json", produces = "application/json", path = "/company")
	    public ResponseEntity<Company> createCompany(@RequestBody Company company) {
	        return new ResponseEntity<>(companyService.createCompany(company), HttpStatus.CREATED);
	    }
	 
	    @PutMapping(consumes = "application/json", produces = "application/json", path = "/company")
	    public ResponseEntity<Company> updateCompany(@RequestBody Company company) {
	        return new ResponseEntity<>(companyService.updateCompany(company), HttpStatus.CREATED);
	    }
	 
	    @DeleteMapping(produces = "application/json", consumes = "text/plain", path = "/company/{cid}")
	    public ResponseEntity<String> deleteCompany(@PathVariable(value = "cid") Long cid) {
	        companyService.deleteCompany(cid);
	        return new ResponseEntity<>("Company with CompanyId : " + cid + " deleted successfully", HttpStatus.OK);
	    }
	 
	    @GetMapping(path = "/company/{cid}", produces = "application/json")
	    public ResponseEntity<Company> getCompany(@PathVariable(value = "cid") Long cid) {
	        return new ResponseEntity<>(companyService.getCompany(cid), HttpStatus.OK);
	    }
	 
	    @GetMapping(path = "/companys", produces = "application/json")
	    public ResponseEntity<List<Company>> getAllCompanys() {
	        return new ResponseEntity<>(companyService.getAllCompany(), HttpStatus.OK);
	    }
}
