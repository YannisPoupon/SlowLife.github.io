package com.slowlife.service;

import java.util.List;

import com.slowlife.entity.Choix;

public interface ChoixService {
	public void save(Choix choix);
	public Choix findById(int id);
	public List<Choix> findAll();
	public void delete(int id);
}
