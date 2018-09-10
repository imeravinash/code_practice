package com.location.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.location.dto.TruckLoc;

public interface TruckRepository extends JpaRepository<TruckLoc, String>{

}
