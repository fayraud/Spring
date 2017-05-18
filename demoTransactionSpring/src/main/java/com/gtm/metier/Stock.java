package com.gtm.metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ValueGenerationType;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Stock {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private int quantite;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

}
