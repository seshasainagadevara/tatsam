package com.seshasai.tatsamapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PriorityArea {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private int priorityId;	
	private String priorityAreaName;
	private int priorityRating;

	public PriorityArea() {
		super();
	}

	public PriorityArea(int priorityId, String priorityAreaName, int priorityRating) {
		super();
		this.priorityId = priorityId;
		this.priorityAreaName = priorityAreaName;
		this.priorityRating = priorityRating;
	}


	//getter and setter for priority id
	public int getPriorityId() {
		return priorityId;
	}
	public void setPriorityId(int priorityId) {
		this.priorityId = priorityId;
	}
	//getter and setter for priority area name
	public String getPriorityAreaName() {
		return priorityAreaName;
	}
	public void setPriorityAreaName(String priorityAreaName) {
		this.priorityAreaName = priorityAreaName;
	}
	//getter and setter for priority rating
	public int getPriorityRating() {
		return priorityRating;
	}
	public void setPriorityRating(int priorityRating) {
		this.priorityRating = priorityRating;
	}


	@Override
	public String toString() {
		return "PriorityArea [priorityId=" + priorityId + ", priorityAreaName=" + priorityAreaName + ", priorityRating="
				+ priorityRating + "]";
	}



}
