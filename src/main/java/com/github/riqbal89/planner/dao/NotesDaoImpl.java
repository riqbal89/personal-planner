package com.github.riqbal89.planner.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.github.riqbal89.planner.entities.Note;
import com.github.riqbal89.planner.mapper.NoteMapper;

public class NotesDaoImpl implements TaskDao {

	@Autowired
	DataSource dataSource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void save(Note note) {
		String sql = "insert into notes values(?, ?, ?, ?, ?, ?, ?)";
		
		jdbcTemplate.update(sql, new Object[] 
				{note.getId(),
						note.getSlug(), 
						note.getDetails(),
						note.getUpdated(),
						note.getUser(),
						note.getCategory(),
						note.getReferences()			
				});	
	}

	@Override
	public List<Note> get(int userId) {
		String sql = "select * from notes where user='" + userId + "'";
		
		List<Note> notes = jdbcTemplate.query(sql, new NoteMapper());
		
		return notes;
	}

}
