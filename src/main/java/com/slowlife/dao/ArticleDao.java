package com.slowlife.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.slowlife.entity.Article;
import com.slowlife.entity.Artisant;
import com.slowlife.entity.Commercant;
import com.slowlife.entity.Particulier;
import com.slowlife.entity.Producteur;

public interface ArticleDao extends JpaRepository<Article, Integer>{
	public List<Article> findByNom(String nom);
	
	@Query("SELECT a FROM Article a WHERE a.nom = ?1 and a.producteur.ville = ?2")
	public List<Article> findProdByNomAndVille(String nom,String ville);
	
	@Query("SELECT a FROM Article a WHERE a.nom = ?1 and a.commercant.ville = ?2")
	public List<Article> findComByNomAndVille(String nom,String ville);
	
	@Query("SELECT a FROM Article a WHERE a.nom = ?1 and a.artisant.ville = ?2")
	public List<Article> findArtByNomAndVille(String nom,String ville);
	
	public List<Article> findByProducteur(Producteur p);
	public List<Article> findByArtisant(Artisant a);
	public List<Article> findByCommercant(Commercant c);
	
}
