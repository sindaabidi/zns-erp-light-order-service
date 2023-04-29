package com.zns.erplight.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.zns.erplight.domain.Commande;
import com.zns.erplight.domain.LigneCommande;
/**
 * Interface for managing methods linked to {@link Commande}.
 */
public interface ICommandeService {

	
	Commande save(Commande produit);
	 
	Page<Commande> findAll(Pageable pageable);
	
	Optional<Commande> findOne(Long id);
	
	void delete(Long id);

	List<LigneCommande> getLigneByCommandeId(Long commandeId);

   
}
