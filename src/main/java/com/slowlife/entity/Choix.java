package com.slowlife.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Choix {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idChoix;
	
	@Column
	private int quantite;
	
	@Column
	private Date dateAchat;
	
	@ManyToOne
    @JoinColumn(name = "particulier")
	private Particulier particulier;
	
	@ManyToOne
    @JoinColumn(name = "article")
	private Article article;
}
