package com.project.StudyCase.service;

import java.util.List;

import com.project.StudyCase.entity.Company;
 
/**
 * @author Mehmet
 *
 */
public interface CompanyService {
	
	public Company createCompany(Company company);
    public Company updateCompany(Company company);
    public Company getCompany(Long cid);
    public void deleteCompany(Long cid);
    public List<Company> getAllCompany();
    
    
}
