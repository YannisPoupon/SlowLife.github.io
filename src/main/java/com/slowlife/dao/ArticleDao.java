package com.slowlife.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.slowlife.entity.Article;

public interface ArticleDao extends JpaRepository<Article, Integer>{
	public List<Article> findByNom(String nom);
	
	@Query("SELECT a FROM Article a WHERE a.nom = ?1 and a.producteur.ville = ?2")
	public List<Article> findByNomAndVille(String nom,String ville);
}
