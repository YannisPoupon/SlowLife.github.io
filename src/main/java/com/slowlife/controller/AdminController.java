package com.slowlife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slowlife.entity.Admin;
import com.slowlife.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService aServ;
	
	@RequestMapping(value="/addAdmin", method=RequestMethod.POST)
	public void saveAdmin(@RequestBody Admin admin) {
		 aServ.save(admin);
	}
	
	@RequestMapping(value="/Admins", method=RequestMethod.GET)
	public List<Admin> getAdmins() {
		 return aServ.findAll();
	}
	
	@RequestMapping(value="/Admin/{id}", method=RequestMethod.GET)
	public Admin getAdminById(@PathVariable int id) {
		 return aServ.findById(id);
	}
	
	@RequestMapping(value="/delAdmin/{id}", method=RequestMethod.DELETE)
	public void deleteAdmin(@PathVariable int id) {
		 aServ.delete(id);
	}
}
