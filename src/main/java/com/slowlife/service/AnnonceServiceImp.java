package com.slowlife.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.slowlife.dao.AnnonceDao;
import com.slowlife.entity.Annonce;

@Service
public class AnnonceServiceImp implements AnnonceService{
	
	@Autowired
	AnnonceDao aDao;


	@Override
	public void save(Annonce annonce) {
		aDao.save(annonce);
	}

	@Override
	public Annonce findById(int id) {
		return aDao.findById(id).get();
	}

	@Override
	public List<Annonce> findAll() {
		return aDao.findAll();
	}

	@Override
	public void delete(int id) {
		aDao.deleteById(id);
		
	}
	
	

}
