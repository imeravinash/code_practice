package com.location.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.location.dto.ClientLoc;

public interface ClientRepository extends JpaRepository<ClientLoc, String> {

}
