package com.skilldistillery.myanimelist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.skilldistillery.myanimelist.data.AnimeShowsDAO;
import com.skilldistillery.myanimelist.entities.AnimeShow;

@Controller
public class AnimeShowController {

	@Autowired
	private AnimeShowsDAO asDAO;

	@RequestMapping(path = { "/", "home.do" })
	public String goHome(Model model) {
		model.addAttribute("animeshows", asDAO.findAll());
		return "home";
	}

	@GetMapping("getShowdetails.do")
	public String displayShow(Integer id, Model model) {
		AnimeShow aShow = asDAO.findById(id);
		model.addAttribute("animeshows", aShow);
		return "show/showdetails";
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
		return "show/showdetails";
	}

	@RequestMapping(path = "create.do")
	public String createShow(Model model, AnimeShow as) {
		model.addAttribute("create", as);
		return "create";
	}

	@RequestMapping(path = "created.do", method = RequestMethod.POST)
	public String createdShow(Model model, AnimeShow as) {
		AnimeShow newAnimeShow = asDAO.create(as);
		model.addAttribute("create", newAnimeShow);
		return "created";
	}

//	@PostMapping("update.do")
//	public String updateShow(AnimeShow as, Model model, RedirectAttributes redir) {
//		asDAO.update(as.getId(), as);
//		model.addAttribute("animeshows", as);
//		return "show/showdetails";
//	}
//	
//	@PostMapping("updated.do")
//	public String updatedShow(AnimeShow as, Model model, RedirectAttributes redir) {
//		asDAO.update(as.getId(), as);
//		model.addAttribute("animeshows", as);
//		return "updated show";
//	}

	@RequestMapping(path = { "update.do" })
	public String updateShowInfo(Model model, Integer cardId, AnimeShow as) {
		model.addAttribute("update", as);
		return "update";
	}

	@RequestMapping(path = "updated.do", method = RequestMethod.POST)
	public String updatedShowInfo(Integer id, Model model, AnimeShow as) {
		AnimeShow updatedAnimeShow = asDAO.update(id, as);
		model.addAttribute("update", updatedAnimeShow);
		return "updated";
	}

//	@PostMapping("delete.do")
//	public String deleteShow(Integer id, Model model, RedirectAttributes redir) {
//	    boolean deletedShow = asDAO.deleteById(0);
//	    redir.addFlashAttribute("deletedShow", deletedShow);
//	    return "redirect:/";
//	}

	@RequestMapping(path = "delete.do")
	public String deleteShow(Integer cardId, Model model) {
		return "delete";
	}

	@RequestMapping(path = "deleted.do", method = RequestMethod.POST)
	public String deletedShow(Model model, AnimeShow as) {
		AnimeShow aShow = asDAO.findById(as.getId());
		boolean deletedShow = asDAO.deleteById(as.getId());
		if (deletedShow) {
			model.addAttribute("delete", aShow.getName() + " Show deleted. ");
		} else {
			model.addAttribute("delete", "Could Not Delete the show. " + aShow.getName());

		}
		return "deleted";
	}

}
