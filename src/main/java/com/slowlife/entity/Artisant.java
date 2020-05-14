package com.slowlife.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Artisant extends User {

	@Column
	private String raisonSociale;

	@Column
	private int siret;

	@Column
	private Privilege privilege;

	@OneToMany(mappedBy = "artisant")
	@JsonIgnore
	private List<Article> articles;
	


	public Artisant() {
		super();
	}


	public Artisant(String raisonSociale, int siret, Privilege privilege, List<Article> articles) {
		super();
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

	public Privilege getPrivilege() {
		return privilege;
	}

	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}

}
