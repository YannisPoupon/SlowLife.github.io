package com.slowlife.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slowlife.entity.Feedback;


public interface FeedbackDao extends JpaRepository<Feedback, Integer>{

}
