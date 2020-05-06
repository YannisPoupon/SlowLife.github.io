package com.slowlife.service;

import java.util.List;

import com.slowlife.entity.Admin;

public interface AdminService {
	public void save(Admin admin);
	public Admin findById(int id);
	public List<Admin> findAll();
	public void delete(int id);
	
	
}
