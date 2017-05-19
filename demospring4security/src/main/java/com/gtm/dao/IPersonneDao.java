package com.gtm.dao;

import java.util.List;

import com.gtm.domaine.Personne;

public interface IPersonneDao {

	public void savePersonne(Personne employe);

	public Personne getPersonneById(int id);
	public Personne loadPersonneByUsername(String username);

	public int getPersonnesCount();
	public List<Personne> getAllPersonnes();

}
