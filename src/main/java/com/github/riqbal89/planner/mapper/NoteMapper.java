package com.github.riqbal89.planner.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.github.riqbal89.planner.entities.Note;

public class NoteMapper implements RowMapper<Note> {

	public Note mapRow(ResultSet resultSet, int arg1) throws SQLException {

		Note note = new Note();
		
		note.setId(resultSet.getInt("id"));
		note.setSlug(resultSet.getString("slug"));
		note.setDetails(resultSet.getString("details"));
		note.setUpdated(resultSet.getTimestamp("updated"));
		note.setUser(resultSet.getInt("user"));
		note.setCategory(resultSet.getString("category"));
		note.setReferences(resultSet.getString("references"));
		return note;
	}
}
