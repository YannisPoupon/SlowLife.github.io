package com.slowlife.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_ARTICLE")
	private int idArticle;
	
	@Column
	private String nom;
	
	@Column
	private TypeArticle typearticle;
	
	@Column
	private int prix;
	
	@Column
	private int quantiteDisponible;
	
	@ManyToOne()
    @JoinColumn(name = "artisant")
	private Artisant artisant;
	
	@ManyToOne
    @JoinColumn(name = "producteur")
	private Producteur producteur;
	
	@ManyToOne
    @JoinColumn(name = "commercant")
	private Commercant commercant;
	
	@OneToMany(mappedBy = "article")
    @JsonIgnore
    private List<Choix> choix;

	public Article() {
		super();
	}

	public Article(String nom, TypeArticle typearticle, int prix, int quantiteDisponible,
			Artisant artisant, Producteur producteur, Commercant commercant) {
		super();
		this.nom = nom;
		this.typearticle = typearticle;
		this.prix = prix;
		this.quantiteDisponible = quantiteDisponible;
		this.artisant = artisant;
		this.producteur = producteur;
		this.commercant=commercant;

	}

	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public TypeArticle getTypearticle() {
		return typearticle;
	}

	public void setTypearticle(TypeArticle typearticle) {
		this.typearticle = typearticle;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getQuantiteDisponible() {
		return quantiteDisponible;
	}

	public void setQuantiteDisponible(int quantiteDisponible) {
		this.quantiteDisponible = quantiteDisponible;
	}

	public Artisant getArtisant() {
		return artisant;
	}

	public void setArtisant(Artisant artisant) {
		this.artisant = artisant;
	}

	public Producteur getProducteur() {
		return producteur;
	}

	public void setProducteur(Producteur producteur) {
		this.producteur = producteur;
	}

	public Commercant getCommercant() {
		return commercant;
	}

	public void setCommercant(Commercant commercant) {
		this.commercant = commercant;
	}

	public List<Choix> getChoix() {
		return choix;
	}

	public void setChoix(List<Choix> choix) {
		this.choix = choix;
	}

	@Override
	public String toString() {
		return "Article [idArticle=" + idArticle + ", nom=" + nom + ", typearticle=" + typearticle + ", prix=" + prix
				+ ", quantiteDisponible=" + quantiteDisponible + ", artisant=" + artisant + ", producteur=" + producteur
				+ ", commercant=" + commercant + ", choix=" + choix + "]";
	}
	
	
}
