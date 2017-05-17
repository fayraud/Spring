package com.gtm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gtm.dao.IDao;
import com.gtm.dao.springdata.UserRepository;
import com.gtm.metier.User;
@Service
@Transactional
public class ServiceImpl implements IService {
	
	
	@Autowired
//	@Qualifier("daoImplHibernate")
//	@Qualifier("daoImplJPA")
//	private IDao dao;
	
	UserRepository userRepository;
	
	
	public void ajouterUser(User u) {
		// TODO Auto-generated method stub
//		dao.ajouterUser(u);
		userRepository.save(u);
	}

	public List<User> listerUser() {
//		return dao.listerUser();
		return userRepository.findAll();
		 
	}

	public void supprimerUser(long id) {
//		dao.supprimerUser(id);
		userRepository.delete(id);

	}

	public User trouverUser(long id) {
		
//		return dao.trouverUser(id);
		return userRepository.findOne(id);
	}

	public List<User> listerParMC(String nom) {
		// TODO Auto-generated method stub
//		return dao.listerParMC(nom);
		return userRepository.findByNomContaining(nom);
	}

	public List<User> listerParNom(String nom) {
		// TODO Auto-generated method stub
//		return dao.listerParNom(nom);
		return userRepository.findByNom(nom);
	}

}
