package com.slowlife.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slowlife.entity.User;
import com.slowlife.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

	@Autowired
	UserService uServ;

	@RequestMapping(value = "/connexion", method = RequestMethod.POST)
	public User connexion(@RequestBody User u) {

		return uServ.verif(u.getLogin(), u.getPassword());
	}
	
	@GetMapping(value="/User/{id}")
    public User findById(@PathVariable int id)  {
        return uServ.findById(id); 
    }

}
