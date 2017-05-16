package com.gtm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gtm.metier.User;
@Repository
@Transactional
public class DaoImplJPA implements IDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void ajouterUser(User u) {
		entityManager.persist(u);
	}

	public List<User> listerUser() {
		Query q = entityManager.createQuery("SELECT c FROM User c");
		return q.getResultList();
	}

	public void supprimerUser(long id) {
		Query q = entityManager.createQuery("SELECT u FROM User u WHERE u.id = :lid");
		q.setParameter("lid", id);
		entityManager.remove((User) q.getSingleResult());
	}

	public User trouverUser(long id) {
		Query q = entityManager.createQuery("SELECT u FROM User u WHERE u.id = :lid");
		q.setParameter("lid", id);
		return (User) q.getSingleResult();
	}

	public List<User> listerParMC(String nom) {
		Query q = entityManager.createQuery("SELECT c FROM User c Where c.nom like :lenom");
		q.setParameter("lenom","%"+nom+"%");
		return  q.getResultList();
	}

	public List<User> listerParNom(String nom) {
		Query q = entityManager.createQuery("SELECT c FROM User c Where c.nom = :lenom");
		q.setParameter("lenom", nom);
		return q.getResultList();
	}

}
