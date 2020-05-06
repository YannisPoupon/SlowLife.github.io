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

import com.slowlife.entity.Commercant;
import com.slowlife.service.CommercantService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CommercantController {
	
	@Autowired
	CommercantService cServ;
	
	@RequestMapping(value="/addCommercant", method = RequestMethod.POST )
	public void add(@RequestBody Commercant c) {
		cServ.save(c);
	}
	
	@DeleteMapping(value="/delCommercant/{id}")
	public void delete(@PathVariable int id) {
		cServ.delete(id);
	}
	
	@GetMapping(value="/Commercants")
	public List<Commercant> findAll() {
		return cServ.findAll(); 
	}
	
	@GetMapping(value="/Commercant/{id}")
	public Commercant findById(@PathVariable int id)  {
		return cServ.findById(id); 
	}

}
