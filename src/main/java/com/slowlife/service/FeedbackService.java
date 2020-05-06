package com.slowlife.service;

import java.util.List;

import com.slowlife.entity.Feedback;

public interface FeedbackService {

	public void save (Feedback feedback);
	public void delete(int id);
	public Feedback findById(int id);
	public List<Feedback> findAll();
}
