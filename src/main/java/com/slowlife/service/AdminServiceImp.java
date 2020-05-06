package com.slowlife.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slowlife.dao.AdminDao;
import com.slowlife.entity.Admin;

@Service
public class AdminServiceImp implements AdminService{
	
	@Autowired
	AdminDao aDao;

	@Override
	public void create(Admin admin) {
		aDao.save(admin);
		
	}
	
	

}
