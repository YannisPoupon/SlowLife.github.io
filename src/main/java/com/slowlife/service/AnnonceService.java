package com.slowlife.service;

import java.util.List;
import com.slowlife.entity.Annonce;
import com.slowlife.entity.Producteur;

public interface AnnonceService {
	public void save(Annonce annonce);
	public Annonce findById(int id);
	public List<Annonce> findAll();
	public void delete(int id);
	
	

	public List<Annonce> findByProducteur(Producteur p);
}
