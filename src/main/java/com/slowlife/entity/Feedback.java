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
	@JoinColumn(name = "userDonne")
	private User userDonne;

	@ManyToOne
	@JoinColumn(name = "userRecoit")
	private User userRecoit;

	public Feedback() {
		super();
	}

	public Feedback(int note, String commentaire, User userDonne, User userRecoit) {
		super();
		this.note = note;
		this.commentaire = commentaire;
		this.userDonne = userDonne;
		this.userRecoit = userRecoit;
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
