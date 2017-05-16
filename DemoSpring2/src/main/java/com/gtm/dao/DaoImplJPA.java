package com.gtm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gtm.metier.User;
@Repository
public class DaoImplJPA implements IDao {

	public void ajouterUser(User u) {
		// TODO Auto-generated method stub
		System.out.println("ajouter a partir de JPA");
	}

	public List<User> listerUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public void supprimerUser(long id) {
		// TODO Auto-generated method stub

	}

	public User trouverUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> listerParMC(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> listerParNom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
