package com.location.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.location.dto.TruckLoc;
import com.location.services.TruckService;

@RestController
public class TruckController {

	@Autowired
	private TruckService truckService;
	
	@RequestMapping("/truckloc/{id}")
	public TruckLoc getTruckLoc(@PathVariable String id) {
		return truckService.getTruckLoc(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="truckloc")
	public void addTruckLoc(@RequestBody TruckLoc truckLoc) {
		truckService.addTruckLoc(truckLoc);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="truckloc/{id}")
	public void updateTruckLoc(@RequestBody TruckLoc truckLoc, @PathVariable String id) {
		truckService.updateTruckLoc(truckLoc,id);
	}
}
