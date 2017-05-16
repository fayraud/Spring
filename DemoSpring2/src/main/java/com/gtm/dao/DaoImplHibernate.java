package com.gtm.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gtm.metier.User;

@Transactional
@Repository
public class DaoImplHibernate implements IDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}


	public void ajouterUser(User u) {
		getSession().save(u);
	}

	public List<User> listerUser() {
		String req = "from User";
		Query query = getSession().createQuery(req);
		return query.list();
	}

	public void supprimerUser(long id) {
		getSession().delete(trouverUser(id));

	}

	public User trouverUser(long id) {
		return (User) getSession().get(User.class, id);
		 
	}

	public List<User> listerParMC(String nom) {
		String req = "from User as u where u.nom like:lenom";
		Query query = getSession().createQuery(req);
		query.setParameter("lenom", "%"+nom+"%");
		return query.list();
	}

	public List<User> listerParNom(String nom) {
		String req = "from User as u where u.nom like:lenom";
		Query query = getSession().createQuery(req);
		query.setParameter("lenom", nom);
		return  (List<User>) query.uniqueResult();
	}

}
