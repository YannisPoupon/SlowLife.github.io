package com.slowlife.service;

import java.util.List;

import com.slowlife.entity.Artisant;
import com.slowlife.entity.Commercant;
import com.slowlife.entity.Feedback;
import com.slowlife.entity.Producteur;

public interface FeedbackService {

	public Feedback save (Feedback feedback);
	public void delete(int id);
	public Feedback findById(int id);
	public List<Feedback> findAll();
	
}
