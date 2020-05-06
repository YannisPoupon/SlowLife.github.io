package com.slowlife.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slowlife.entity.Producteur;
@Service
public class ProducteurServiceImp implements ProducteurService{

	@Autowired
	ProducteurService prDao;
	
	
	@Override
	public void save(Producteur producteur) {
		prDao.save(producteur);
		
	}

	@Override
	public void delete(int id) {
		prDao.delete(id);
		
	}

	@Override
	public Producteur findById(int id) {
		return prDao.findById(id);
	}

	@Override
	public List<Producteur> findAll() {
		return prDao.findAll();
	}

}
