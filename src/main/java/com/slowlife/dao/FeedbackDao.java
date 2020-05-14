package com.slowlife.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slowlife.entity.Artisant;
import com.slowlife.entity.Commercant;
import com.slowlife.entity.Feedback;
import com.slowlife.entity.Producteur;


public interface FeedbackDao extends JpaRepository<Feedback, Integer>{

}
