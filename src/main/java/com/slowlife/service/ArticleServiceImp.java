package com.slowlife.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slowlife.dao.ArticleDao;
import com.slowlife.entity.Article;
import com.slowlife.entity.Artisant;
import com.slowlife.entity.Commercant;
import com.slowlife.entity.Particulier;
import com.slowlife.entity.Producteur;
import com.slowlife.entity.User;

@Service
public class ArticleServiceImp implements ArticleService{

	@Autowired
	ArticleDao adao;
	
	@Override
	public void save(Article a) {
		adao.save(a);
		
	}

	@Override
	public void delete(int id) {
		adao.deleteById(id);
		
	}

	@Override
	public List<Article> findAll() {
		return adao.findAll();
	}

	@Override
	public Article findById(int id) {
		return adao.findById(id).get();
	}

	@Override
	public List<Article> findByNom(String nom) {
		return adao.findByNom(nom);
	}

	@Override
	public List<Article> findByNomAndVille(String nom, String ville) {
		return adao.findByNomAndVille(nom, ville);
	}

	@Override
	public List<Article> findByProducteur(Producteur p) {
		return adao.findByProducteur(p);
	}

	@Override
	public List<Article> findByArtisant(Artisant a) {
		// TODO Auto-generated method stub
		return adao.findByArtisant(a);
	}

	@Override
	public List<Article> findByCommercant(Commercant c) {
		// TODO Auto-generated method stub
		return adao.findByCommercant(c);
	}

	
}
