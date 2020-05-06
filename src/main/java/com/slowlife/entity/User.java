package com.slowlife.entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE",discriminatorType = DiscriminatorType.STRING)
public abstract class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_USER")
	private int idUser;
	
	@Column
	private String password;
	
	@Column
	private String mail;
	
	@Column
	private String nom;
	
	@Column
	private String prenom;
	
	@Column
	private String rue;
	
	@Column
	private String ville;
	
	@Column
	private int département;

	@OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Feedback> feedbacks;
	
	
	public User() {
		super();
	}


	public User(String password, String mail, String nom, String prenom, String rue, String ville,
			int département) {
		super();
		this.password = password;
		this.mail = mail;
		this.nom = nom;
		this.prenom = prenom;
		this.rue = rue;
		this.ville = ville;
		this.département = département;
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


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public int getDépartement() {
		return département;
	}


	public void setDépartement(int département) {
		this.département = département;
	}
	
	
	
}
