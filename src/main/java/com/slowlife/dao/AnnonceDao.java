package com.slowlife.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.slowlife.entity.Annonce;
import com.slowlife.entity.Article;
import com.slowlife.entity.Artisant;
import com.slowlife.entity.Commercant;
import com.slowlife.entity.Producteur;

public interface AnnonceDao extends JpaRepository<Annonce, Integer>{

	
	public List<Annonce> findByProducteur(Producteur p);
	
//	@Query("SELECT a FROM Annonce a WHERE a.typeAnnonce = ?1 and a.artisant.ville = ?2 and a.dateDebut >= "
//			+ " '?3' and a.dateFin <='?4'")
//	public List<Annonce> findArtByNomAndVille(String nom,String ville);
//	
//	@Query("SELECT a FROM Annonce a WHERE a.typeAnnonce = ?1 and a.producteur.ville = ?2 and a.dateDebut "
//			+ " >= '?3' and dateFin <= '?4'")
//	public List<Annonce> findProdByNomAndVille(String nom,String ville);
//	
//	@Query("SELECT a FROM Annonce a WHERE a.typeAnnonce = ?1 and a.commercant.ville = ?2 and a.dateDebut"
//			+ " >= '?3' and dateFin <= '?4'" )
//	public List<Annonce> findComByNomAndVille(String nom,String ville);
//	
	
	
}
