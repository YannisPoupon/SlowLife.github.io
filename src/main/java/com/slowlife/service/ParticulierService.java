package com.slowlife.service;

import java.util.List;

import com.slowlife.entity.Particulier;

public interface ParticulierService {

	public void save (Particulier particulier);
	public void delete(int id);
	public Particulier findById(int id);
	public List<Particulier> findAll();
	
}
