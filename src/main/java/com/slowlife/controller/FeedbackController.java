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

import com.slowlife.entity.Article;
import com.slowlife.entity.Artisant;
import com.slowlife.entity.Commercant;
import com.slowlife.entity.Feedback;
import com.slowlife.entity.Producteur;
import com.slowlife.service.FeedbackService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FeedbackController {
	
	@Autowired
	FeedbackService fes;
	
	@RequestMapping(value="/addFeedback", method=RequestMethod.POST)
	public Feedback save(@RequestBody Feedback f) { 
		return fes.save(f);	
		
	}
	
	@DeleteMapping(value="/delFeedback/{id}")
	public void delete(@PathVariable int id) {
		fes.delete(id);
	}
	@RequestMapping(value="/Feedbacks", method=RequestMethod.GET)
	public List<Feedback> liste() {
		return fes.findAll();
	}
	@GetMapping(value="/Feedback/{id}")
    public Feedback findById(@PathVariable int id)  {
        return fes.findById(id); 
    }

	
}
