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

import com.slowlife.entity.Artisant;
import com.slowlife.service.ArtisantService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ArtisantController {

	@Autowired
	ArtisantService aServ;
	
	@RequestMapping(value="/addArtisant", method = RequestMethod.POST )
	public void add(@RequestBody Artisant a) {
		aServ.save(a);
	}
	
	@DeleteMapping(value="/delArtisant/{id}")
	public void delete(@PathVariable int id) {
		aServ.delete(id);
	}
	
	@GetMapping(value="/Artisants")
	public List<Artisant> findAll() {
		return aServ.findAll(); 
	}
	
	@GetMapping(value="/Artisant/{id}")
	public Artisant findById(@PathVariable int id)  {
		return aServ.findById(id); 
	}
}
