package com.slowlife.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slowlife.dao.FeedbackDao;
import com.slowlife.entity.Feedback;
@Service
public class FeedbackServiceImp implements FeedbackService{

	@Autowired
	FeedbackDao fDao;
	
	@Override
	public Feedback save(Feedback feedback) {
		return fDao.save(feedback);
	}

	@Override
	public void delete(int id) {
		fDao.deleteById(id);
		
	}

	@Override
	public Feedback findById(int id) {
		return fDao.findById(id).get();
	}

	@Override
	public List<Feedback> findAll() {
		return fDao.findAll();
	}

}
