package com.github.riqbal89.planner.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.github.riqbal89.planner.entities.Login;
import com.github.riqbal89.planner.entities.User;
import com.github.riqbal89.planner.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("login");
		modelAndView.addObject("login", new Login());
		return modelAndView;
	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("login") Login login, HttpSession session) {
		ModelAndView modelAndView = null;
		User user = userService.validateUser(login);

		if (user != null) {
			modelAndView = new ModelAndView("welcome");
			modelAndView.addObject("firstname", user.getFirstname());
			session.setAttribute("user", user);
		} else {
			modelAndView = new ModelAndView("failed");
		}
		return modelAndView;
	}

}
