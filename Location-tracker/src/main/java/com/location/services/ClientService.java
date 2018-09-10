package com.location.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.location.dto.ClientLoc;
import com.location.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;

	public void addClientLoc(ClientLoc clientLoc) {
		int i=new Random().nextInt();
		clientLoc.setE_id(Integer.toString(i));
		clientRepository.save(clientLoc);
	}

	public List<ClientLoc> getAllClients() {
		List<ClientLoc> clients=new ArrayList<>();
		clientRepository.findAll()
		.forEach(clients::add);
		if(clients.isEmpty()) {
			throw new RuntimeException("No Clients Found");
		}
		return clients;
	}

	

	

}
