package com.slowlife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.slowlife.entity.Particulier;
import com.slowlife.service.ParticulierService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ParticulierController {

	@Autowired
	ParticulierService ps;
	
	@RequestMapping(value="/addParticulier", method=RequestMethod.POST)
	public void save(@RequestBody Particulier p) { 
		ps.save(p);	
	}
	
	@DeleteMapping(value="/delParticulier/{id}")
	public void delete(@PathVariable int id) {
		ps.delete(id);
	}
	@RequestMapping(value="/Particuliers", method=RequestMethod.GET)
	public List<Particulier> liste() {
		return ps.findAll();
	}
	@GetMapping(value="/Particulier/{id}")
    public Particulier findById(@PathVariable int id)  {
        return ps.findById(id); 
    }
	
}
