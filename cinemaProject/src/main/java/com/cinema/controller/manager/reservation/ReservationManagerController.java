package com.cinema.controller.manager.reservation;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cinema.repository.criteria.Criteria;
import com.cinema.repository.reservation.ReservationManagerResultMap;

public interface ReservationManagerController {

	public void reservationManagerList(Model model, Criteria cri);

	public void reservationManagerGet(@RequestParam("resNo") long resNo, Model model);

	public String reservationManagerModify(ReservationManagerResultMap reservationManagerResultMap,
			@ModelAttribute("cri") Criteria cri, RedirectAttributes rttr);

	public String reservationManagerDelete(@RequestParam("resNo") long resNo, @ModelAttribute("cri") Criteria cri,
			RedirectAttributes rttr);

}
