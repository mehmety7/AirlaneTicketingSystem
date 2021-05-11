package com.project.StudyCase.service;

import java.util.List;

import com.project.StudyCase.entity.Route;
 
/**
 * @author Mehmet
 *
 */
public interface RouteService {
	
	public Route createRoute(Route route);
    public Route updateRoute(Route route);
    public Route getRoute(Long rid);
    public void deleteRoute(Long rid);
    public List<Route> getAllRoute();
    
    
}
