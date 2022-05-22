package com.cinema.service.manager.reservation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.mapper.manager.reservation.ReservationManagerMapper;
import com.cinema.repository.criteria.Criteria;
import com.cinema.repository.reservation.ReservationManagerDto;
import com.cinema.repository.reservation.ReservationManagerResultMap;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
@NoArgsConstructor
public class ReservationManagerServiceImpl implements ReservationManagerService {

	@Autowired(required = false)
	ReservationManagerResultMap reservationManagerResultMap;

	@Autowired
	ReservationManagerMapper reservationManagerMapper;

	@Override
	public List<ReservationManagerResultMap> reservationManagerList(Criteria cri) {
		return reservationManagerMapper.reservationManagerList(cri);
	}

	@Override
	public int reservationManagerGetTotalCount() {
		return reservationManagerMapper.reservationManagerGetTotalCount();
	}

	@Override
	public List<ReservationManagerResultMap> reservationManagerGet(long resNo) {
		return reservationManagerMapper.reservationManagerGet(resNo);
	}

	@Override
	public boolean reservationManagerModify(ReservationManagerResultMap reservationManagerResultMap) {
		return reservationManagerMapper.reservationManagerModify(reservationManagerResultMap);
	}

	@Override
	public boolean reservationManagerDelete(long resNo) {
		return reservationManagerMapper.reservationManagerDelete(resNo);
	}

}
