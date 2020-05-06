package com.slowlife.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slowlife.dao.ArtisantDao;
import com.slowlife.entity.Artisant;

@Service
public class ArtisantServiceImp implements ArtisantService{

	
	@Autowired
	ArtisantDao adao;
	
	@Override
	public void save(Artisant a) {
		adao.save(a);
		
	}

	@Override
	public void delete(int id) {
		adao.deleteById(id);
		
	}

	@Override
	public List<Artisant> findAll() {
		return adao.findAll();
	}

	@Override
	public Artisant findById(int id) {
		return adao.findById(id).get();
	}

}
