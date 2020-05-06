package com.slowlife.service;

import java.util.List;

import com.slowlife.entity.Article;

public interface ArticleService {
	
	public void save(Article a);
	public void delete(int id);
	public List<Article> findAll();
	public Article findById(int id);

}
