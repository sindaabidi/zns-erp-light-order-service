package com.zns.erplight.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.zns.erplight.dto.OrderDTO;

public interface IOrderService {

	OrderDTO save(OrderDTO commande);
	
	Page<OrderDTO> findAll(Pageable pageable);

	List<OrderDTO> getAllOrderByClientId(Long clientId);

	List<OrderDTO> getAllOrderByPrixTotalGreaterThan(BigDecimal prixTotal);
	
	List<OrderDTO> getAllOrderByPrixTotalLess(BigDecimal prixTotal);

	
	List<OrderDTO> getAllOrderByDateBetween(LocalDate dateDebut, LocalDate dateFin);
	
	List<OrderDTO> getAllOrderByClientIdAndDateValeurBetween(Long clientId, LocalDate dateDebut, LocalDate dateFin);
	
	List<OrderDTO> findAll();

	Optional<OrderDTO> findOne(Long id);

	void delete(Long id);

	List<OrderDTO> getAllOrderByPrixTotalBetween(BigDecimal prixMin, BigDecimal prixMax);

}
