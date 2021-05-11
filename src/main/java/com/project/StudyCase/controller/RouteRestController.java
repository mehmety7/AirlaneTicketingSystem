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

import com.project.StudyCase.entity.Route;
import com.project.StudyCase.service.RouteService;
 
/**
 * @author Mehmet
 *
 */
@RestController
public class RouteRestController {

	 @Autowired
	    private RouteService routeService;
	 
	    @PostMapping(consumes = "application/json", produces = "application/json", path = "/route")
	    public ResponseEntity<Route> createRoute(@RequestBody Route route) {
	        return new ResponseEntity<>(routeService.createRoute(route), HttpStatus.CREATED);
	    }
	 
	    @PutMapping(consumes = "application/json", produces = "application/json", path = "/route")
	    public ResponseEntity<Route> updateRoute(@RequestBody Route route) {
	        return new ResponseEntity<>(routeService.updateRoute(route), HttpStatus.CREATED);
	    }
	 
	    @DeleteMapping(produces = "application/json", consumes = "text/plain", path = "/route/{rid}")
	    public ResponseEntity<String> deleteRoute(@PathVariable(value = "rid") Long rid) {
	        routeService.deleteRoute(rid);
	        return new ResponseEntity<>("Route with RouteId : " + rid + " deleted successfully", HttpStatus.OK);
	    }
	 
	    @GetMapping(path = "/route/{rid}", produces = "application/json")
	    public ResponseEntity<Route> getRoute(@PathVariable(value = "rid") Long rid) {
	        return new ResponseEntity<>(routeService.getRoute(rid), HttpStatus.OK);
	    }
	 
	    @GetMapping(path = "/routes", produces = "application/json")
	    public ResponseEntity<List<Route>> getAllRoutes() {
	        return new ResponseEntity<>(routeService.getAllRoute(), HttpStatus.OK);
	    }
}
