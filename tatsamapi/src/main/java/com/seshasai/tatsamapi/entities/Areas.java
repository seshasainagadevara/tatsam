package com.seshasai.tatsamapi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Areas {
	@Id
	private int priorityId;	
	private String priorityAreaName;
	private int priorityRating;

	public Areas() {
		super();
	}

	public int getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(int priorityId) {
		this.priorityId = priorityId;
	}

	public String getPriorityAreaName() {
		return priorityAreaName;
	}

	public void setPriorityAreaName(String priorityAreaName) {
		this.priorityAreaName = priorityAreaName;
	}

	public Areas(int priorityId, String priorityAreaName, int priorityRating) {
		super();
		this.priorityId = priorityId;
		this.priorityAreaName = priorityAreaName;
		this.priorityRating = priorityRating;
	}

	@Override
	public String toString() {
		return "Areas [priorityId=" + priorityId + ", priorityAreaName=" + priorityAreaName + ", priorityRating="
				+ priorityRating + "]";
	}

	public int getPriorityRating() {
		return priorityRating;
	}

	public void setPriorityRating(int priorityRating) {
		this.priorityRating = priorityRating;
	}

}
