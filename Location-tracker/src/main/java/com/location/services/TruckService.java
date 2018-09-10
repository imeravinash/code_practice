package com.location.services;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.location.dto.TruckLoc;
import com.location.repositories.TruckRepository;

@Service
public class TruckService {

	@Autowired
	private TruckRepository truckRepository;
	
	public void addTruckLoc(TruckLoc truckLoc) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
		truckLoc.setTimestamp(dateFormat.format(new Date()));
		truckRepository.save(truckLoc);
	}

	public void updateTruckLoc(TruckLoc truckLoc,String id) {
		truckRepository.save(truckLoc);
	}

	public TruckLoc getTruckLoc(String id) {
		return truckRepository.findOne(id);
	}
}
