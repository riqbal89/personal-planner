package com.github.riqbal89.planner.entities;

public class Note extends Task {

	private String category;
	private String references;
	
	public Note() {
		
	}
	
	public Note(int userId) {
		this.user = userId;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getReferences() {
		return references;
	}

	public void setReferences(String references) {
		this.references = references;
	}

}
