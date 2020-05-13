package com.slowlife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slowlife.entity.Annonce;
import com.slowlife.entity.Producteur;
import com.slowlife.service.AnnonceService;


@RestController
public class AnnonceController {
	
	@Autowired
	AnnonceService aServ;
	
	@RequestMapping(value="/addAnnonce", method=RequestMethod.POST)
	public void saveAnnonce(@RequestBody Annonce annonce) {
		 aServ.save(annonce);
	}
	
	@RequestMapping(value="/Annonces", method=RequestMethod.GET)
	public List<Annonce> getAnnonces() {
		 return aServ.findAll();
	}
	
	@RequestMapping(value="/Annonce/{id}", method=RequestMethod.GET)
	public Annonce getAnnonceById(@PathVariable int id) {
		 return aServ.findById(id);
	}
	
	@RequestMapping(value="/delAnnonce/{id}", method=RequestMethod.DELETE)
	public void deleteAnnonce(@PathVariable int id) {
		 aServ.delete(id);
	}
	@RequestMapping(value="/findannoncebyprod",method = RequestMethod.POST)
	public List<Annonce> findByProducteur(@RequestBody Producteur p)  {
		return aServ.findByProducteur(p);
	}
}
