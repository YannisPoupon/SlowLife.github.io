package com.slowlife.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Annonce {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ANNONCE")
	private int idAnnonce;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column
	private Date dateDebut;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column
	private Date dateFin;

	@Column
	private String typeannonce;

	@Column
	private int nombrePlace;

	@Column
	private String compensation;

	@ManyToOne
	@JoinColumn(name = "producteur")
	private Producteur producteur;

	@ManyToMany(cascade = { CascadeType.REFRESH, CascadeType.MERGE }, fetch = FetchType.LAZY)
	@JoinTable(name = "ANNONCE_PARTICULIER", joinColumns = @JoinColumn(name = "FK_ANNONCE", referencedColumnName = "ID_ANNONCE"), inverseJoinColumns = @JoinColumn(name = "FK_USER", referencedColumnName = "ID_USER"))
	private List<Particulier> particuliers = new ArrayList<>();

	public Annonce() {
		super();
	}

	public Annonce(Date dateDebut, Date dateFin, String typeannonce, int nombrePlace, String compensation,
			Producteur producteur) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.typeannonce = typeannonce;
		this.nombrePlace = nombrePlace;
		this.compensation = compensation;
		this.producteur = producteur;
	}

	public int getIdAnnonce() {
		return idAnnonce;
	}

	public void setIdAnnonce(int idAnnonce) {
		this.idAnnonce = idAnnonce;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public int getNombrePlace() {
		return nombrePlace;
	}

	public void setNombrePlace(int nombrePlace) {
		this.nombrePlace = nombrePlace;
	}

	public String getCompensation() {
		return compensation;
	}

	public void setCompensation(String compensation) {
		this.compensation = compensation;
	}

	public Producteur getProducteur() {
		return producteur;
	}

	public void setProducteur(Producteur producteur) {
		this.producteur = producteur;
	}

	public List<Particulier> getParticuliers() {
		return particuliers;
	}
	
	
	public String getTypeannonce() {
		return typeannonce;
	}

	public void setTypeannonce(String typeannonce) {
		this.typeannonce = typeannonce;
	}

	public void setParticuliers(List<Particulier> particuliers) {
		this.particuliers = particuliers;
	}

	@Override
	public String toString() {
		return "Annonce [idAnnonce=" + idAnnonce + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
				+ ", typeannonce=" + typeannonce + ", nombrePlace=" + nombrePlace + ", compensation=" + compensation
				+ ", producteur=" + producteur + ", particuliers=" + particuliers + "]";
	}

}
