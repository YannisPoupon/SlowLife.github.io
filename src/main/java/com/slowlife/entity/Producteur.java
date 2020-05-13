package com.slowlife.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Producteur extends User {

	@Column
	private String raisonSociale;

	@Column
	private int siret;

	@Column
	private Privilege privilege;

	@OneToMany(mappedBy = "producteur")
	@JsonIgnore
	private List<Annonce> annonces;

	@OneToMany(mappedBy = "producteur")
	@JsonIgnore
	private List<Article> articles;

	
	public Producteur(int idUser, String login, String password, String mail, String nom, String prenom, int numero,
			String rue, String ville, int departement, double longitude, double latitude) {
		super(idUser, login, password, mail, nom, prenom, numero, rue, ville, departement, longitude, latitude);
	}

	public Producteur(int idUser, String login, String password, String mail, String nom, String prenom, int numero,
			String rue, String ville, int departement, double longitude, double latitude, String raisonSociale,
			int siret, Privilege privilege, List<Annonce> annonces, List<Article> articles) {
		super(idUser, login, password, mail, nom, prenom, numero, rue, ville, departement, longitude, latitude);
		this.raisonSociale = raisonSociale;
		this.siret = siret;
		this.privilege = privilege;
		this.annonces = annonces;
		this.articles = articles;
	}

	public Producteur() {
		super();
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public int getSiret() {
		return siret;
	}

	public void setSiret(int siret) {
		this.siret = siret;
	}

	public Privilege getPrivilege() {
		return privilege;
	}

	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}

	public List<Annonce> getAnnonces() {
		return annonces;
	}

	public void setAnnonces(List<Annonce> annonces) {
		this.annonces = annonces;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
