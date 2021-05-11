package com.project.StudyCase.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.StudyCase.entity.Company;
import com.project.StudyCase.repository.CompanyRepository;
import com.project.StudyCase.service.CompanyService;
 
/**
 * @author Mehmet
 *
 */
@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
    private CompanyRepository companyRepository;
 
    @Override
    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }
 
    @Override
    public Company updateCompany(Company company) {
        return companyRepository.save(company);
    }
 
    @Override
    public Company getCompany(Long cid) {
        Optional<Company> optionalEmp = companyRepository.findById(cid);
        if (optionalEmp.isPresent()) {
            return optionalEmp.get();
        }
        return null;
    }
 
    @Override
    public void deleteCompany(Long cid) {
        companyRepository.deleteById(cid);
    }
 
    @Override
    public List<Company> getAllCompany() {
        return companyRepository.findAll();
    }
}
