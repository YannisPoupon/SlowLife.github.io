package com.slowlife.entity;

import javax.persistence.*;

@Entity
public class Admin extends User{
	
	@Column
	private int SecteurGestion;
	
	private Privilege privilege;


	public Admin(String password, String mail, String nom, String prenom, String rue, String ville, int département) {
		super(password, mail, nom, prenom, rue, ville, département);
	}
	
	public Admin(String password, String mail, String nom, String prenom, String rue, String ville, int département,
			int secteurGestion) {
		super(password, mail, nom, prenom, rue, ville, département);
		SecteurGestion = secteurGestion;
	}

	public int getSecteurGestion() {
		return SecteurGestion;
	}

	public void setSecteurGestion(int secteurGestion) {
		SecteurGestion = secteurGestion;
	}

	
}
