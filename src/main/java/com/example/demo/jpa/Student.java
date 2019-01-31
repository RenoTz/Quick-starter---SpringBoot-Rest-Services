package com.example.demo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "etudiant")
public class Student {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;

	public Long getId() {

		return this.id;
	}

	public void setId(Long id) {

		this.id = id;
	}

	public String getNom() {

		return this.nom;
	}

	public String getPrenom() {

		return this.prenom;
	}

	public void setNom(String nom) {

		this.nom = nom;
	}

	public void setPrenom(String prenom) {

		this.prenom = prenom;
	}

}
