
package com.location.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.location.dto.ClientLoc;
import com.location.services.ClientService;

@RestController
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@RequestMapping("/clients")
	public List<ClientLoc> getClientLoc() {
		return clientService.getAllClients();
	}
	@RequestMapping(method=RequestMethod.POST, value="clientloc")
	public void addClientLoc(@RequestBody ClientLoc clientLoc){
		clientService.addClientLoc(clientLoc);
	}
	
}
