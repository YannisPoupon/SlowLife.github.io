package com.slowlife.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slowlife.entity.Choix;
import com.slowlife.entity.Producteur;
import com.slowlife.entity.User;

public interface UserDao extends JpaRepository<User, Integer>{

	public User findByLogin(String login);

	
}
