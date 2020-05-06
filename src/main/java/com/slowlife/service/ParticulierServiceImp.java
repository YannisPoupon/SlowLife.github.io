package com.slowlife.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slowlife.dao.ParticulierDao;
import com.slowlife.entity.Particulier;
@Service
public class ParticulierServiceImp implements ParticulierService{
	
	@Autowired
	ParticulierDao pDao;

	@Override
	public void save(Particulier particulier) {
		pDao.save(particulier);
		
	}

	@Override
	public void delete(int id) {
		pDao.deleteById(id);
		
	}

	@Override
	public Particulier findById(int id) {
		return pDao.findById(id).get();
	}

	@Override
	public List<Particulier> findAll() {
		return pDao.findAll();
	}

}
