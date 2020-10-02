package com.slowlife.service;

import java.util.List;

import com.slowlife.entity.Choix;
import com.slowlife.entity.Particulier;

public interface ChoixService {
	public Choix save(Choix choix);
	public Choix findById(int id);
	public List<Choix> findAll();
	public void delete(int id);
	public List<Choix> findByParticulier(Particulier p);
}
