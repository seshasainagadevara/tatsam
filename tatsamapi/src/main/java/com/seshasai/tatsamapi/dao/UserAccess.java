package com.seshasai.tatsamapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seshasai.tatsamapi.entities.User;

public interface UserAccess extends JpaRepository<User, String>{
	
}
