package com.cinema.service.manager.reservation;

import java.util.List;

import com.cinema.repository.criteria.Criteria;
import com.cinema.repository.reservation.ReservationManagerDto;
import com.cinema.repository.reservation.ReservationManagerResultMap;

public interface ReservationManagerService {

	public List<ReservationManagerResultMap> reservationManagerList(Criteria cri);

	public int reservationManagerGetTotalCount();

	public List<ReservationManagerResultMap> reservationManagerGet(long resNo);

	public boolean reservationManagerManagerModify(ReservationManagerResultMap reservationManagerResultMap);

	public boolean reservationManagerManagerDelete(long resNo);

}
