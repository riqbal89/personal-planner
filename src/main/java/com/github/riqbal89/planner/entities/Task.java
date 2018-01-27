package com.github.riqbal89.planner.entities;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public abstract class Task {

	protected int id;
	protected String slug;
	protected String details;
	protected LocalDateTime updated;
	protected int user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public LocalDateTime getUpdated() {
		return updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated.toLocalDateTime();
	}

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

}
