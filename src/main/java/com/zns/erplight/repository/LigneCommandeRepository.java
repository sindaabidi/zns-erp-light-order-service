package com.zns.erplight.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zns.erplight.domain.LigneCommande;


/**
 * Spring Data  repository for the CarnetCommande entity.
 */
@Repository
public interface LigneCommandeRepository extends JpaRepository<LigneCommande, Long> {

	/**
	 * 
	 * NOTA:  
		* Remember that Spring Data systematically manages classic CRUDs without having
		* to implement them such as save, update, delete find All and find by ID.
		* However, we can overload them as we wish (if needed)
		* Query, Query Native
	 */
	
/**
 * Queries (Methods) relating to the main Business Rules (search)
 */
public Page<LigneCommande> findByEtat(Long etat, Pageable pageable);
public Page<LigneCommande> findByPrixUnitaire(BigDecimal prixUnitaire, Pageable pageable);
 
 
/**
 * Finders
 */

public List<LigneCommande>  findByPrixTotalLessThan(BigDecimal prixTotal);

public List<LigneCommande>  findByPrixTotalGreaterThan(BigDecimal prixTotal);

/**
 * Just an example in case we want to appeal
  * to the query (which is not recommended for Spring Data performace)
 */
@Query(
		  " SELECT  c FROM LigneCommande c "
		    + " WHERE  c.etat = ?1 "
		    + " AND  c.prixTotal > ?2 " 
)	
public List<LigneCommande> findByEtatAndPrixTotSup(Long etat, BigDecimal prixTotal);


@Query(
		  " SELECT  c FROM LigneCommande c "
		    + " WHERE  c.commandeId = ?1 "
)	
public List<LigneCommande> findByCommandeId(Long commandeId);



}