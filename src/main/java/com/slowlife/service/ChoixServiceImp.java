package com.slowlife.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.slowlife.dao.AnnonceDao;
import com.slowlife.dao.ChoixDao;
import com.slowlife.entity.Annonce;
import com.slowlife.entity.Choix;

@Service
public class ChoixServiceImp implements ChoixService{
	
	@Autowired
	ChoixDao cDao;


	@Override
	public void save(Choix choix) {
		cDao.save(choix);
	}

	@Override
	public Choix findById(int id) {
		return cDao.findById(id).get();
	}

	@Override
	public List<Choix> findAll() {
		return cDao.findAll();
	}

	@Override
	public void delete(int id) {
		cDao.deleteById(id);
		
	}
	
	

}
