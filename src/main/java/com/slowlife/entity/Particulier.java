package com.slowlife.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Particulier extends User{

	
	//Liste des favoris
	@ManyToMany(cascade = {CascadeType.REFRESH, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(name = "ARTICLE_PARTICULIER", joinColumns = @JoinColumn(name = "FK_USER", referencedColumnName = "ID_USER"), inverseJoinColumns = @JoinColumn(name = "FK_ARTICLE", referencedColumnName = "ID_ARTICLE"))
    private List<Article> articles = new ArrayList<>();
	
	@OneToMany(mappedBy = "particulier")
    @JsonIgnore
    private List<Choix> choix;

	public Particulier(String password, String mail, String nom, String prenom, String rue, String ville,
			int département) {
		super(password, mail, nom, prenom, rue, ville, département);
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
	
	
	
}
