package com.github.riqbal89.planner.dao;

import java.util.List;

import com.github.riqbal89.planner.entities.Note;

public interface TaskDao {
	
//	public Task save(Task task);
	public List<Note> get(int userId);

}
