package com.slowlife.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.slowlife.entity.Annonce;
import com.slowlife.entity.Producteur;

public interface AnnonceDao extends JpaRepository<Annonce, Integer> {

	public List<Annonce> findByProducteur(Producteur p);

	@Query("SELECT a FROM Annonce a WHERE a.producteur.ville = ?1 and a.dateDebut" + " >= '?2T00:00:00.000+0000' and dateFin <= '?3T00:00:00.000+0000'")
	public List<Annonce> findComByNomAndVille(String ville, Date dateDebut, Date dateFin);

}
