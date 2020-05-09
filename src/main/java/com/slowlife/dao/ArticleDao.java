package com.slowlife.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.slowlife.entity.Article;

public interface ArticleDao extends JpaRepository<Article, Integer>{
	public List<Article> findByNom(String nom);
}
