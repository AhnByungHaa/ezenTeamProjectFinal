package com.cinema.controller.manager.notice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cinema.repository.criteria.Criteria;
import com.cinema.repository.notice.NoticeManagerDto;

public interface NoticeManagerController {

	public void noticeRegister();
	
	public String noticeManagerRegister(NoticeManagerDto noticeManagerDto, RedirectAttributes rttr);
	
	public void noticeManagerList(Model model, Criteria cri);
	
	public void noticeManagerGet(@RequestParam("noticeNo") long noticeNo, Model model);
	
	public String noticeManagerModify(NoticeManagerDto noticeManagerDto, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr);
	
	public String noticeManagerDelete(@RequestParam("noticeNo") long noticeNo, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr);
}
