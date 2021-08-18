package com.seshasai.tatsamapi.services;

import java.util.List;

import com.seshasai.tatsamapi.entities.Areas;
import com.seshasai.tatsamapi.entities.PriorityArea;
import com.seshasai.tatsamapi.entities.User;

public interface PriorityService {

	List<Areas> getPriorityAreas();
	
	List<PriorityArea> getMyPriority(String userID);

	User addPriority(User user);
}
