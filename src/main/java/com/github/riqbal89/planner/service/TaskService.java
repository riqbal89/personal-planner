package com.github.riqbal89.planner.service;

import java.util.List;

import com.github.riqbal89.planner.entities.Task;

public abstract class TaskService {
	
	protected abstract Task update(Task task); // return a task because it's been updated, possibly?
	
	protected abstract Task save(Task task); // return a task because it's been saved, possibly?
	
	protected abstract List<Task> get(int userId); // get all tasks for user

}
