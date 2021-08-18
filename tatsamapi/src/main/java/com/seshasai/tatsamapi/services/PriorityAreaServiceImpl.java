package com.seshasai.tatsamapi.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seshasai.tatsamapi.dao.AreasAccess;
import com.seshasai.tatsamapi.dao.PriorityAccess;
import com.seshasai.tatsamapi.dao.UserAccess;
import com.seshasai.tatsamapi.entities.Areas;
import com.seshasai.tatsamapi.entities.PriorityArea;
import com.seshasai.tatsamapi.entities.User;


@Service
public class PriorityAreaServiceImpl implements PriorityService{

	@Autowired
	private PriorityAccess accessdao;

	@Autowired
	private UserAccess usersdao;

	@Autowired
	private AreasAccess areasdao;


	public PriorityAreaServiceImpl() {

	}

	@Override
	public List<Areas> getPriorityAreas() {

		return areasdao.findAll();
	}

	@Override
	public List<PriorityArea> getMyPriority(String userID) {

          User user = usersdao.getById(userID);
          return user.getPriorities();
	}


	@Override
	public User addPriority(User user) {
		this.usersdao.save(user);
         return user;
	}



}
