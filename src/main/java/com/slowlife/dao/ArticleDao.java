package com.slowlife.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.slowlife.entity.Article;

public interface ArticleDao extends JpaRepository<Article, Integer>{

}
