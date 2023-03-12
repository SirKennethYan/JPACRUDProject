package com.skilldistillery.myanimelist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.myanimelist.data.AnimeShowsDAO;
import com.skilldistillery.myanimelist.entities.AnimeShow;

@Controller
public class AnimeShowController {

	
	@Autowired
	private AnimeShowsDAO asDAO;
	
	@RequestMapping(path= { "/", "home.do" } )
	public String goHome(Model model) {
		model.addAttribute("animeshows", asDAO.findAll());
		return "home";
	}
	
	@GetMapping("show.do")
	public String displayShow(Integer id, Model model) {
	    AnimeShow aShow = asDAO.findById(id);
	    model.addAttribute("animeShow", aShow);
	    return "show";
	}
	
//	@GetMapping("show.do")
//	public ModelAndView displayShow1(Integer id) {	
//	    AnimeShow aShow = asDAO.findById(id);
//	    ModelAndView mv = new ModelAndView();
//	    mv.addObject("animeShow", aShow);
//	    mv.setViewName("show");
//	    return mv;
//	}

	@GetMapping("findById.do")
	public String findById(Integer id, Model model) {
		AnimeShow aShow = asDAO.findById(id);
		model.addAttribute("animeshows", aShow);
		return "show";
	}
	
	
	
}
