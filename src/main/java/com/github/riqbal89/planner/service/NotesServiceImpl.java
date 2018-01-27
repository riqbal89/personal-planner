package com.github.riqbal89.planner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.riqbal89.planner.dao.NotesDaoImpl;
import com.github.riqbal89.planner.entities.Note;
import com.github.riqbal89.planner.entities.Task;

public class NotesServiceImpl {

	@Autowired
	public NotesDaoImpl noteDao;

	public Task update(Note note) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Note note) {
		noteDao.save(note);
	}

	public List<Note> get(int userId) {
		return noteDao.get(userId);
	}

}
