package com.github.riqbal89.planner.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.github.riqbal89.planner.entities.Note;
import com.github.riqbal89.planner.entities.User;
import com.github.riqbal89.planner.service.NotesServiceImpl;

@Controller
public class NotesController {
	
	@Autowired
	private NotesServiceImpl noteService;

	@RequestMapping(value = "/note", method = RequestMethod.GET)
	public ModelAndView note(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView("note");
		modelAndView.addObject("note", new Note());
		return modelAndView;
	}
	
	@RequestMapping(value = "/processNote", method = RequestMethod.POST)
	public ModelAndView processNote(HttpServletRequest request, HttpServletResponse response, HttpSession session, @ModelAttribute("note") Note note) {
		User user = (User) session.getAttribute("user");
		note.setUser(user.getId()); 
		noteService.save(note);
		return new ModelAndView("welcome", "firstname" , note.getSlug());
	}
	
	@RequestMapping(value = "/notes", method = RequestMethod.GET)
	public ModelAndView getNote(HttpServletRequest request, HttpServletResponse response, HttpSession session, @ModelAttribute("note") Note note) {
		User user = (User) session.getAttribute("user");
		List<Note> notes = noteService.get(user.getId());
		return new ModelAndView("notes", "notes" , notes);
	}
	
	
}
