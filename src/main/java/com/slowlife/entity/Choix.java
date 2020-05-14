package com.slowlife.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Choix {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idChoix;
	
	@Column
	private int quantite;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column
	private Date dateAchat;
	
	@ManyToOne
    @JoinColumn(name = "particulier")
	private Particulier particulier;
	
	@ManyToOne
    @JoinColumn(name = "article")
	private Article article;

	@OneToMany(mappedBy = "choix")
	@JsonIgnore
	private List<Feedback> feedbacks;
	
	public Choix() {
		super();
	}

	public Choix(int quantite, Date dateAchat, Particulier particulier, Article article) {
		super();
		this.quantite = quantite;
		this.dateAchat = dateAchat;
		this.particulier = particulier;
		this.article = article;
	}

	public int getIdChoix() {
		return idChoix;
	}

	public void setIdChoix(int idChoix) {
		this.idChoix = idChoix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public Particulier getParticulier() {
		return particulier;
	}

	public void setParticulier(Particulier particulier) {
		this.particulier = particulier;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@Override
	public String toString() {
		return "Choix [idChoix=" + idChoix + ", quantite=" + quantite + ", dateAchat=" + dateAchat + ", particulier="
				+ particulier + ", article=" + article + "]";
	}
	
	
}
