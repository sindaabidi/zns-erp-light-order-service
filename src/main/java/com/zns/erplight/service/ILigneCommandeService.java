package com.zns.erplight.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.zns.erplight.domain.LigneCommande;
import com.zns.erplight.domain.Produit;
/**
 * Interface for managing methods linked to {@link LigneCommande}.
 */
public interface ILigneCommandeService {

	
	LigneCommande save(LigneCommande produit);
	 
	Page<LigneCommande> findAll(Pageable pageable);
	
	List<LigneCommande> findAll();
	
	Optional<LigneCommande> findOne(Long id);
	
	void delete(Long id);
	
	List<Produit> getProduits();

	Produit getProduitById(Long id);

   
}
