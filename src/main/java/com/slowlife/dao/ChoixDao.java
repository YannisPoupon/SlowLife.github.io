package com.slowlife.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slowlife.entity.Choix;
import com.slowlife.entity.Particulier;

public interface ChoixDao extends JpaRepository<Choix, Integer>{

	public List<Choix> findByParticulier(Particulier p);
	
}
