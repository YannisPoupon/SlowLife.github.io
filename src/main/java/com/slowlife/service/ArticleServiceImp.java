package com.slowlife.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slowlife.dao.ArticleDao;
import com.slowlife.entity.Article;

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

}
