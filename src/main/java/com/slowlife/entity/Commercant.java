package com.slowlife.entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Commercant extends User {

	@Column
	private String raisonSociale;

	@Column
	private int siret;

	@Column
	private Privilege privilege;

	@OneToMany(mappedBy = "commercant")
	@JsonIgnore
	private List<Article> articles;

	public Commercant() {
		super();
	}

	
	public Commercant(int idUser, String login, String password, String mail, String nom, String prenom, int numero,
			String rue, String ville, int departement, double longitude, double latitude) {
		super(idUser, login, password, mail, nom, prenom, numero, rue, ville, departement, longitude, latitude);
	}

	public Commercant(int idUser, String login, String password, String mail, String nom, String prenom, int numero,
			String rue, String ville, int departement, double longitude, double latitude, String raisonSociale,
			int siret, Privilege privilege, List<Article> articles) {
		super(idUser, login, password, mail, nom, prenom, numero, rue, ville, departement, longitude, latitude);
		this.raisonSociale = raisonSociale;
		this.siret = siret;
		this.privilege = privilege;
		this.articles = articles;
	}




	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public Privilege getPrivilege() {
		return privilege;
	}

	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}

	public int getSiret() {
		return siret;
	}

	public void setSiret(int siret) {
		this.siret = siret;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
