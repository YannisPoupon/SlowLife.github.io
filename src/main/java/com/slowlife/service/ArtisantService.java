package com.slowlife.service;

import java.util.List;

import com.slowlife.entity.Artisant;

public interface ArtisantService {
	
	public void save(Artisant a);
	public void delete(int id);
	public List<Artisant> findAll();
	public Artisant findById(int id);

}
