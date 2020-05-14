package com.slowlife.entity;

import javax.persistence.*;

@Entity
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFeedback;

	@Column
	private int note;

	@Column
	private String commentaire;

	@ManyToOne
	@JoinColumn(name="choix")
	private Choix choix;
	
	@ManyToOne
	@JoinColumn(name = "userDonne")
	private User userDonne;

	@ManyToOne
	@JoinColumn(name = "userRecoit")
	private User userRecoit;
	

	public Feedback() {
		super();
	}



	public Feedback(int idFeedback, int note, String commentaire, Choix choix, User userDonne, User userRecoit) {
		super();
		this.idFeedback = idFeedback;
		this.note = note;
		this.commentaire = commentaire;
		this.choix = choix;
		this.userDonne = userDonne;
		this.userRecoit = userRecoit;
	}



	public Choix getChoix() {
		return choix;
	}



	public void setChoix(Choix choix) {
		this.choix = choix;
	}



	public User getUserDonne() {
		return userDonne;
	}

	public void setUserDonne(User userDonne) {
		this.userDonne = userDonne;
	}

	public User getUserRecoit() {
		return userRecoit;
	}

	public void setUserRecoit(User userRecoit) {
		this.userRecoit = userRecoit;
	}

	public int getIdFeedback() {
		return idFeedback;
	}

	public void setIdFeedback(int idFeedback) {
		this.idFeedback = idFeedback;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

}
