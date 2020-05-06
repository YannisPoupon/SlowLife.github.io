package com.slowlife.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slowlife.entity.Annonce;

public interface AnnonceDao extends JpaRepository<Annonce, Integer>{

}
