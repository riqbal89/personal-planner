package com.github.riqbal89.planner.entities;

import java.time.LocalDateTime;

public class Todo extends Task {

	private Boolean done = Boolean.FALSE;
	private String category;
	private LocalDateTime dueDate;

	public Boolean getDone() {
		return done;
	}

	public void setDone(Boolean done) {
		this.done = done;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDateTime getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}

}
