package com.slowlife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.slowlife.entity.Choix;
import com.slowlife.service.ArticleService;
import com.slowlife.service.ChoixService;
import com.slowlife.service.EmailServiceImpl;
import com.slowlife.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ChoixController {
	
	@Autowired
	ChoixService cServ;
	
	@Autowired
	ArticleService artServ;
	
	@Autowired
	EmailServiceImpl es;
	
	@Autowired
	UserService us;
	
	
	@RequestMapping(value="/addChoix", method=RequestMethod.POST)
	public void saveChoix(@RequestBody Choix choix) {
		
		
		artServ.achatArticle(choix.getArticle().getIdArticle(), choix.getQuantite());
		Choix choixSaved = cServ.save(choix);
		System.out.println(choixSaved);
		String to = artServ.findById(choixSaved.getArticle().getIdArticle()).getProducteur().getMail();
		String subject = "Nouvel Achat";
		String prenom = artServ.findById(choixSaved.getArticle().getIdArticle()).getProducteur().getPrenom();
		int qtitePrise = choixSaved.getQuantite();
		String nomArticle = artServ.findById(choixSaved.getArticle().getIdArticle()).getNom();
		int prix = artServ.findById(choixSaved.getArticle().getIdArticle()).getPrix();
		int id = choixSaved.getIdChoix();
		
	
		String text = "Bonjour " + prenom+
				", un client vous a acheté "+qtitePrise+" "+nomArticle+"(s) pour un total de "+
				prix*qtitePrise+" euros. Le numéro de la réservation est "+id+
				". Le client vous communiquera ce numéro lors de son passage muni de sa carte d'identité. L'équipe SlowLife.";
		es.sendSimpleMessage(to, subject, text);
		
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
	
	@RequestMapping(value="/sendmail/{to}/{subject}/{text}",method = RequestMethod.GET)
	public void sendmail(@PathVariable String to, @PathVariable String subject, @PathVariable String text)  {
		es.sendSimpleMessage(to, subject, text);
	}
}
