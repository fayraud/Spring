package com.gtm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gtm.dao.IDao;
import com.gtm.metier.User;
@Service
public class ServiceImpl implements IService {
	
	
	@Autowired
	@Qualifier("daoImplHibernate")
//	@Qualifier("daoImplJPA")
	private IDao dao;
	
	
	public void ajouterUser(User u) {
		// TODO Auto-generated method stub
		dao.ajouterUser(u);
	}

	public List<User> listerUser() {
		return dao.listerUser();
		 
	}

	public void supprimerUser(long id) {
		dao.supprimerUser(id);

	}

	public User trouverUser(long id) {
		
		return dao.trouverUser(id);
	}

	public List<User> listerParMC(String nom) {
		// TODO Auto-generated method stub
		return dao.listerParMC(nom);
	}

	public User listerParNom(String nom) {
		// TODO Auto-generated method stub
		return dao.listerParNom(nom);
	}

}
