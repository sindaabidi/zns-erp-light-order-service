package com.zns.erplight.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.zns.erplight.domain.Client;
/**
 * Interface for managing methods linked to {@link Client}.
 */
public interface IClientService {

	
	Client save(Client produit);
	 
	Page<Client> findAll(Pageable pageable);
	
	List<Client> findAll();
	
	Optional<Client> findOne(Long id);
	
	void delete(Long id);

	Optional<Client> findFist();

   
}
