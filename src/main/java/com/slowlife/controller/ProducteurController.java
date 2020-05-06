package com.slowlife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.slowlife.entity.Producteur;
import com.slowlife.service.ProducteurService;

@RestController
public class ProducteurController {


	@Autowired
	ProducteurService prs;
	
	@RequestMapping(value="/addProducteur", method=RequestMethod.POST)
	public void save(@RequestBody Producteur p) { 
		prs.save(p);	
	}
	
	@DeleteMapping(value="/delProducteur/{id}")
	public void delete(@PathVariable int id) {
		prs.delete(id);
	}
	@RequestMapping(value="/Producteurs", method=RequestMethod.GET)
	public List<Producteur> liste() {
		return prs.findAll();
	}
	@GetMapping(value="/Producteur/{id}")
    public Producteur findById(@PathVariable int id)  {
        return prs.findById(id); 
    }
	}

