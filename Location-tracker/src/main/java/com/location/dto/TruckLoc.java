package com.location.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TruckLoc {
	
	@Id
	private String e_id;
	private String t_no;
	private String name;
	private String type;
	private String lat;
	private String lon;
	private String timestamp;
	private String msg;
	private String status;
	
	public TruckLoc() {
		
	}

	public TruckLoc(String e_id, String t_no, String name, String type, String lat, String lon, String timestamp,
			String msg, String status) {
		super();
		this.e_id = e_id;
		this.t_no = t_no;
		this.name = name;
		this.type = type;
		this.lat = lat;
		this.lon = lon;
		this.timestamp = timestamp;
		this.msg = msg;
		this.status = status;
	}

	public String getE_id() {
		return e_id;
	}

	public void setE_id(String e_id) {
		this.e_id = e_id;
	}

	public String getT_no() {
		return t_no;
	}

	public void setT_no(String t_no) {
		this.t_no = t_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
