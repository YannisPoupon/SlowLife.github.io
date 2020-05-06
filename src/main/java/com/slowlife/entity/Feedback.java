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
    @JoinColumn(name = "user")
	private User user;

	public Feedback() {
		super();
	}

	public Feedback(int note, String commentaire, User user) {
		super();
		this.note = note;
		this.commentaire = commentaire;
		this.user = user;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}

