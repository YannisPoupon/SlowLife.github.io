package com.slowlife.controller;

import java.util.ArrayList;
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
import com.slowlife.entity.TypeAnnonce;
import com.slowlife.service.AnnonceService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AnnonceController {
	
	@Autowired
	AnnonceService aServ;
	
	@RequestMapping(value="/addAnnonce", method=RequestMethod.POST)
	public void saveAnnonce(@RequestBody Annonce annonce) {
		System.out.println(annonce.toString());
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
	
	@RequestMapping(value="/typeAnnonceEnum",method = RequestMethod.GET)
	public List<String> getTypeAnnonceEnum()  {
		List<String> ListesTypeAnnonces = new ArrayList<String>();
		for(TypeAnnonce ann:TypeAnnonce.values()) {
			ListesTypeAnnonces.add(ann.toString());
		}
		return ListesTypeAnnonces;
	}
}
