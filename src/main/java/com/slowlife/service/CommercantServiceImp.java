package com.slowlife.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slowlife.dao.CommercantDao;
import com.slowlife.entity.Commercant;

@Service
public class CommercantServiceImp implements CommercantService{

	
	@Autowired
	CommercantDao cdao;
	
	@Override
	public void save(Commercant c) {
		cdao.save(c);
		
	}

	@Override
	public void delete(int id) {
		cdao.deleteById(id);
		
	}

	@Override
	public List<Commercant> findAll() {
		return cdao.findAll();
	}

	@Override
	public Commercant findById(int id) {
		return cdao.findById(id).get();
	}

}
