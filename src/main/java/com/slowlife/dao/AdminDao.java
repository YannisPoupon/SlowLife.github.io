package com.slowlife.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slowlife.entity.Admin;

public interface AdminDao extends JpaRepository<Admin, Integer>{

}
