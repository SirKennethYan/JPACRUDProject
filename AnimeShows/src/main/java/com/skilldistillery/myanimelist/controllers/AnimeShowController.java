package com.skilldistillery.myanimelist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.myanimelist.data.AnimeShowsDAO;

@Controller
public class AnimeShowController {

	
	@Autowired
	private AnimeShowsDAO asDAO;
	
	@RequestMapping(path= { "/", "home.do" } )
	public String goHome(Model model) {
		model.addAttribute("animeshows", asDAO.findAll());
		return "home";
	}
}
