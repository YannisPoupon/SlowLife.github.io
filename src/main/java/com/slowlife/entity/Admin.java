package com.slowlife.entity;

import javax.persistence.*;

@Entity
public class Admin extends User {

	@Column
	private int secteurGestion;

	private Privilege privilege;

	public Admin() {
		super();
	}

	

	public Admin(int idUser, String login, String password, String mail, String nom, String prenom, int numero,
			String rue, String ville, int departement, double longitude, double latitude) {
		super(idUser, login, password, mail, nom, prenom, numero, rue, ville, departement, longitude, latitude);
	}


	public Admin(int idUser, String login, String password, String mail, String nom, String prenom, int numero,
			String rue, String ville, int departement, double longitude, double latitude, int secteurGestion,
			Privilege privilege) {
		super(idUser, login, password, mail, nom, prenom, numero, rue, ville, departement, longitude, latitude);
		this.secteurGestion = secteurGestion;
		this.privilege = privilege;
	}



	public int getSecteurGestion() {
		return secteurGestion;
	}

	public void setSecteurGestion(int secteurGestion) {
		this.secteurGestion = secteurGestion;
	}

	public Privilege getPrivilege() {
		return privilege;
	}

	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}

}
