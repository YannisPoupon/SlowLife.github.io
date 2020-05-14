package com.slowlife.service;

import java.util.List;

import com.slowlife.entity.Article;
import com.slowlife.entity.Artisant;
import com.slowlife.entity.Commercant;
import com.slowlife.entity.Producteur;

public interface ArticleService {
	
	public void save(Article a);
	public void delete(int id);
	public List<Article> findAll();
	public Article findById(int id);
	public List<Article> findByNom(String nom);
	public List<Article> findProdByNomAndVille(String nom,String ville);
	public List<Article> findArtByNomAndVille(String nom,String ville);
	public List<Article> findComByNomAndVille(String nom,String ville);
	public List<Article> findByProducteur(Producteur p);
	public List<Article> findByArtisant(Artisant a);
	public List<Article> findByCommercant(Commercant c);
	public void achatArticle(int idArticle, int qtitePrise);

}
