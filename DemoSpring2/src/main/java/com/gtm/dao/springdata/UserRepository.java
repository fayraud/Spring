package com.gtm.dao.springdata;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gtm.metier.User;

public interface UserRepository extends JpaRepository<User, Long>{
	public List<User> findByNom(String nom);
	
	@Query("SELECT u FROM User u Where u.nom like %?1%")
	public List<User> findByNomContaining(String mc);
}
