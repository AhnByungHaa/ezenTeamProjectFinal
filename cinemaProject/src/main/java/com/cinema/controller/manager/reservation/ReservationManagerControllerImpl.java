
package com.cinema.controller.manager.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cinema.repository.criteria.Criteria;
import com.cinema.repository.page.PageDto;
import com.cinema.repository.reservation.ReservationManagerResultMap;
import com.cinema.service.manager.reservation.ReservationManagerService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/reservationManager/*")
@AllArgsConstructor
@NoArgsConstructor
public class ReservationManagerControllerImpl implements ReservationManagerController {

	@Autowired
	ReservationManagerService reservationManagerService;

	@Override
	@GetMapping("/list")
	public void reservationManagerList(Model model, Criteria cri) {
		model.addAttribute("reservationList", reservationManagerService.reservationManagerList(cri));
		model.addAttribute("pageMaker", new PageDto(cri, reservationManagerService.reservationManagerGetTotalCount()));
	}

	@Override

	@GetMapping({ "/reservation", "modify" })
	public void reservationManagerGet(@RequestParam("resNo") long resNo, Model model) {
		model.addAttribute("reservation", reservationManagerService.reservationManagerGet(resNo));
	}

	@Override

	@PostMapping("/modify")
	public String reservationManagerModify(ReservationManagerResultMap reservationManagerResultMap, @ModelAttribute("cri") Criteria cri,
			RedirectAttributes rttr) {
		if (reservationManagerService.reservationManagerManagerModify(reservationManagerResultMap)) {
			rttr.addFlashAttribute("result", "success");
		} else
			rttr.addFlashAttribute("result", "fail");
		rttr.addAttribute("p", cri.getPageNum());
		return "redirect:/reservationManager/list";
	}

	@Override
	@PostMapping("/delete")
	public String reservationManagerDelete(@RequestParam("resNo") long resNo, @ModelAttribute("cri") Criteria cri,
			RedirectAttributes rttr) {
		boolean result = reservationManagerService.reservationManagerManagerDelete(resNo);
		if (result == true) {
			rttr.addFlashAttribute("result", "success");
		} else
			rttr.addFlashAttribute("result", "fail");
		rttr.addAttribute("p", cri.getPageNum());
		return "redirect:/reservationManager/list";
	}

}
