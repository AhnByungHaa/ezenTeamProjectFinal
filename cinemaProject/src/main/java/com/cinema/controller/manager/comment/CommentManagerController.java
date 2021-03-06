package com.cinema.controller.manager.comment;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cinema.repository.criteria.Criteria;

public interface CommentManagerController {

	public void CommentManagerList(Model model, Criteria cri);

	public String CommentManagerDelete(@RequestParam("commentNo") long commentNo, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr);


}
