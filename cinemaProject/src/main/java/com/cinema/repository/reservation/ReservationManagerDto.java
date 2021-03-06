package com.cinema.repository.reservation;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationManagerDto {

	private long resNo;
	private long memberNo;
	private long movieNo;
	private String movieTitle;
	private String movieEtitle;
	private String movieType;
	private String movieGrade;
	private String resCinema;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date resDate;
	private String resTheater;
	private String resPerson;
	private int resTotal;
	private String resSeatNo;
	
}
