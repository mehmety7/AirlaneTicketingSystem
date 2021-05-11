package com.project.StudyCase.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.StudyCase.entity.Route;
import com.project.StudyCase.repository.RouteRepository;
import com.project.StudyCase.service.RouteService;
 
/**
 * @author Mehmet
 *
 */
@Service
public class RouteServiceImpl implements RouteService {
	
	@Autowired
    private RouteRepository routeRepository;
 
    @Override
    public Route createRoute(Route route) {
        return routeRepository.save(route);
    }
 
    @Override
    public Route updateRoute(Route route) {
        return routeRepository.save(route);
    }
 
    @Override
    public Route getRoute(Long rid) {
        Optional<Route> optionalEmp = routeRepository.findById(rid);
        if (optionalEmp.isPresent()) {
            return optionalEmp.get();
        }
        return null;
    }
 
    @Override
    public void deleteRoute(Long rid) {
        routeRepository.deleteById(rid);
    }
 
    @Override
    public List<Route> getAllRoute() {
        return routeRepository.findAll();
    }
}
