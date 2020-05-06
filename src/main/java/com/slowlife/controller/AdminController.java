package com.slowlife.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@RequestMapping(value="/admin", method=RequestMethod.POST)
	public void deleteCollege(@RequestBody Admin admin) {
		 aServ.create(admin);
	}
}
