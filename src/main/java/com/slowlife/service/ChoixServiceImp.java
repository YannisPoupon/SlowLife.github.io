package com.slowlife.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slowlife.dao.ArticleDao;
import com.slowlife.dao.ChoixDao;
import com.slowlife.entity.Choix;
import com.slowlife.entity.Particulier;
import com.slowlife.entity.User;

@Service
public class ChoixServiceImp implements ChoixService{
	
	@Autowired
	ChoixDao cDao;

	

	@Override
	public Choix save(Choix choix) {
		return cDao.save(choix);
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

	@Override
	public List<Choix> findByParticulier(Particulier p) {
		// TODO Auto-generated method stub
		return cDao.findByParticulier(p);
	}

		
	
	

}
