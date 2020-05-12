package com.slowlife.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slowlife.entity.Annonce;
import com.slowlife.entity.Article;
import com.slowlife.entity.Artisant;
import com.slowlife.entity.Commercant;
import com.slowlife.entity.Producteur;

public interface AnnonceDao extends JpaRepository<Annonce, Integer>{

	
	public List<Annonce> findByProducteur(Producteur p);
	
	
	
}
