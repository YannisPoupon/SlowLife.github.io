package com.slowlife.service;

import java.util.List;

import com.slowlife.entity.Article;
import com.slowlife.entity.Artisant;
import com.slowlife.entity.Commercant;
import com.slowlife.entity.Particulier;
import com.slowlife.entity.Producteur;
import com.slowlife.entity.User;

public interface ArticleService {
	
	public void save(Article a);
	public void delete(int id);
	public List<Article> findAll();
	public Article findById(int id);
	public List<Article> findByNom(String nom);
	public List<Article> findByNomAndVille(String nom,String ville);
	
	public List<Article> findByProducteur(Producteur p);
	public List<Article> findByArtisant(Artisant a);
	public List<Article> findByCommercant(Commercant c);

}
