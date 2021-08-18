package com.seshasai.tatsamapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seshasai.tatsamapi.entities.PriorityArea;

public interface PriorityAccess extends JpaRepository<PriorityArea, Integer>{
	

}

