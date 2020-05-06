package com.slowlife.service;

import java.util.List;


import com.slowlife.entity.Producteur;

public interface ProducteurService {
	
	public void save (Producteur producteur);
	public void delete(int id);
	public Producteur findById(int id);
	public List<Producteur> findAll();
	
}
