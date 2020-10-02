package com.slowlife.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE", discriminatorType = DiscriminatorType.STRING)

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USER")
	private int idUser;

	@Column
	private String login;

	@Column
	private String password;

	@Column(unique=true)
	private String mail;

	@Column
	private String nom;

	@Column
	private String prenom;
	
	@Column
	private int numero;

	@Column
	private String rue;

	@Column
	private String ville;

	@Column
	private int departement;
	
	@Column
	private double longitude;
	
	@Column
	private double latitude;

	@OneToMany(mappedBy = "userDonne")
	@JsonIgnore
	private List<Feedback> feedbacksD;

	@OneToMany(mappedBy = "userRecoit")
	@JsonIgnore
	private List<Feedback> feedbacksR;

	public User() {
		super();
	}


	public User(int idUser, String login, String password, String mail, String nom, String prenom, int numero,
			String rue, String ville, int departement, double longitude, double latitude) {
		super();
		this.idUser = idUser;
		this.login = login;
		this.password = password;
		this.mail = mail;
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
		this.rue = rue;
		this.ville = ville;
		this.departement = departement;
		this.longitude = longitude;
		this.latitude = latitude;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public double getLongitude() {
		return longitude;
	}



	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}



	public double getLatitude() {
		return latitude;
	}



	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}



	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public List<Feedback> getFeedbacksD() {
		return feedbacksD;
	}

	public void setFeedbacksD(List<Feedback> feedbacksD) {
		this.feedbacksD = feedbacksD;
	}

	public List<Feedback> getFeedbacksR() {
		return feedbacksR;
	}

	public void setFeedbacksR(List<Feedback> feedbacksR) {
		this.feedbacksR = feedbacksR;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getDepartement() {
		return departement;
	}

	public void setDepartement(int departement) {
		this.departement = departement;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
