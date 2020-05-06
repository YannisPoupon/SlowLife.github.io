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

	public Admin(String login, String password, String mail, String nom, String prenom, String rue, String ville,
			int département) {
		super(login, password, mail, nom, prenom, rue, ville, département);
	}

	public Admin(String login, String password, String mail, String nom, String prenom, String rue, String ville,
			int département, int secteurGestion, Privilege privilege) {
		super(login, password, mail, nom, prenom, rue, ville, département);
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
