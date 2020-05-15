package com.slowlife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slowlife.entity.Admin;
import com.slowlife.entity.User;
import com.slowlife.service.EmailServiceImpl;
import com.slowlife.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

	@Autowired
	EmailServiceImpl es;
	
	@Autowired
	UserService uServ;

	@RequestMapping(value = "/connexion", method = RequestMethod.POST)
	public User connexion(@RequestBody User u) {

		return uServ.verif(u.getLogin(), u.getPassword());
	}
	
	@RequestMapping(value = "/recup", method = RequestMethod.POST)
	public boolean recup (@RequestBody User u) {

		User userRecup = uServ.recup(u.getMail());
		if (userRecup!=null) {
		String newLine = System.getProperty("line.separator");
		String subject = "SlowLife : récupération de vos identifiants";
		String text = "Vous avez demander l'envoie de vos identifiants"
				+ newLine + newLine + "Login : " + userRecup.getLogin()
				+ newLine + "Mot de pass : " + userRecup.getPassword()
				+ newLine + newLine + newLine + " A bientôt !"
				+ newLine + "l'équipe Slowlife";
		es.sendSimpleMessage(userRecup.getMail(), subject, text);
		
		return true;} 
		
		else return false;
	}
	
	@GetMapping(value="/User/{id}")
    public User findById(@PathVariable int id)  {
        return uServ.findById(id); 
    }

	@GetMapping(value="/users")
    public List<User> getall()  {
        return uServ.findUsers();
    }
	
	@RequestMapping(value="/updateUser", method=RequestMethod.PUT)
	public void saveUser(@RequestBody User u) {
		 uServ.updateUser(u);
	}
	
	@RequestMapping(value="/delUser/{id}", method=RequestMethod.DELETE)
	public void deleteById(@PathVariable int id) {
		 uServ.deleteById(id);
	}
}
