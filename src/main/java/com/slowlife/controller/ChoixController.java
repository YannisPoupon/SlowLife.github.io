package com.slowlife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slowlife.entity.Choix;
import com.slowlife.service.ChoixService;

@RestController
public class ChoixController {
	
	@Autowired
	ChoixService cServ;
	
	@RequestMapping(value="/addChoix", method=RequestMethod.POST)
	public void saveChoix(@RequestBody Choix choix) {
		cServ.save(choix);
	}
	
	@RequestMapping(value="/Choix", method=RequestMethod.GET)
	public List<Choix> getChoix() {
		 return cServ.findAll();
	}
	
	@RequestMapping(value="/Choix/{id}", method=RequestMethod.GET)
	public Choix getAnnonceById(@PathVariable int id) {
		 return cServ.findById(id);
	}
	
	@RequestMapping(value="/delChoix/{id}", method=RequestMethod.DELETE)
	public void deleteAnnonce(@PathVariable int id) {
		cServ.delete(id);
	}
}
