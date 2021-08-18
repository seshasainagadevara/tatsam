package com.seshasai.tatsamapi.entities;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class User {
	
	
	@Id
	private String userID;
	
	@OneToMany(
		    cascade = CascadeType.ALL)
	@ElementCollection()
	private List<PriorityArea> priorities = new ArrayList<PriorityArea>();

	public User() {
		super();

	}
	public User(String userID, ArrayList<PriorityArea> priorities) {
		super();
		this.userID = userID;
		this.priorities = priorities;
	}


	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public List<PriorityArea> getPriorities() {
		return priorities;
	}
	public void setPriorities(ArrayList<PriorityArea> priorities) {
		this.priorities = priorities;
	}



}
