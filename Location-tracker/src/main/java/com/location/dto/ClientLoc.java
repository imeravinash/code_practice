package com.location.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClientLoc {

	@Id
	private String e_id;
	private String lat;
	private String lon;
	
	public ClientLoc() {
		
	}

	public ClientLoc(String e_id, String lat, String lon) {
		super();
		this.e_id = e_id;
		this.lat = lat;
		this.lon = lon;
	}

	public String getE_id() {
		return e_id;
	}

	public void setE_id(String e_id) {
		this.e_id = e_id;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}
	
	
}
