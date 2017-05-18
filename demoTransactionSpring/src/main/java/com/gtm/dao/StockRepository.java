package com.gtm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.gtm.metier.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {
	
	@Modifying
	@Query("update Stock s set s.quantite=s.quantite-?2 where s.id=?1")
	Void sortArcticleDuStock(int id, int qute);
	
}
