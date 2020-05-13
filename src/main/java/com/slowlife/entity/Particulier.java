package com.slowlife.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Particulier extends User {

	@Column
	private Privilege privilege;

	// Liste des favoris
	@ManyToMany(cascade = { CascadeType.REFRESH, CascadeType.MERGE }, fetch = FetchType.LAZY)
	@JoinTable(name = "ARTICLE_PARTICULIER", joinColumns = @JoinColumn(name = "FK_USER", referencedColumnName = "ID_USER"), inverseJoinColumns = @JoinColumn(name = "FK_ARTICLE", referencedColumnName = "ID_ARTICLE"))
	private List<Article> articles = new ArrayList<>();

	@OneToMany(mappedBy = "particulier")
	@JsonIgnore
	private List<Choix> choix;



	public Particulier(int idUser, String login, String password, String mail, String nom, String prenom, int numero,
			String rue, String ville, int departement, double longitude, double latitude) {
		super(idUser, login, password, mail, nom, prenom, numero, rue, ville, departement, longitude, latitude);
	}

	public Particulier(int idUser, String login, String password, String mail, String nom, String prenom, int numero,
			String rue, String ville, int departement, double longitude, double latitude, Privilege privilege,
			List<Article> articles, List<Choix> choix) {
		super(idUser, login, password, mail, nom, prenom, numero, rue, ville, departement, longitude, latitude);
		this.privilege = privilege;
		this.articles = articles;
		this.choix = choix;
	}

	public Particulier() {
		super();
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public List<Choix> getChoix() {
		return choix;
	}

	public void setChoix(List<Choix> choix) {
		this.choix = choix;
	}

	public Privilege getPrivilege() {
		return privilege;
	}

	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}

}
