package com.cinema.mapper.manager.reservation;

import java.util.List;

import com.cinema.repository.criteria.Criteria;
import com.cinema.repository.reservation.ReservationManagerDto;
import com.cinema.repository.reservation.ReservationManagerResultMap;

public interface ReservationManagerMapper {
	
	public List<ReservationManagerResultMap> reservationManagerList(Criteria cri);
	
	public int reservationManagerGetTotalCount();
	
	public List<ReservationManagerResultMap> reservationManagerGet(long resNo);
	
	public boolean reservationManagerModify(ReservationManagerResultMap reservationManagerResultMap);
	
	public boolean reservationManagerDelete(long resNo);
	
}
