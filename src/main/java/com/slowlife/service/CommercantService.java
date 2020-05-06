package com.slowlife.service;

import java.util.List;

import com.slowlife.entity.Commercant;

public interface CommercantService {
	public void save(Commercant c);
	public void delete(int id);
	public List<Commercant> findAll();
	public Commercant findById(int id);

}
