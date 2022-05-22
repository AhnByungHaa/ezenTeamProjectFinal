package com.cinema.controller.manager.movie;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cinema.repository.criteria.Criteria;
import com.cinema.repository.movie.MovieManagerDto;

public interface MovieManagerController {

	public void movieManagerList(Model model, Criteria cri);

	public void movieManagerGet(@RequestParam("movieNo") long movieNo, Model model);

	public void movieManagerRegister();

	public String movieManagerRegister(MovieManagerDto movieManagerDto, RedirectAttributes rttr);

	public String movieManagerModify(MovieManagerDto movieManagerDto, @ModelAttribute("cri") Criteria cri,
			RedirectAttributes rttr);

	public String movieManagerDelete(@RequestParam("movieNo") long movieNo, @ModelAttribute("cri") Criteria cri,
			RedirectAttributes rttr);

}
