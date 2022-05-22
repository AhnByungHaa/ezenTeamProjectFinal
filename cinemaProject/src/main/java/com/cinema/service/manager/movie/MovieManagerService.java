package com.cinema.service.manager.movie;

import java.util.List;

import com.cinema.repository.criteria.Criteria;
import com.cinema.repository.movie.MovieManagerDto;

public interface MovieManagerService {

	public List<MovieManagerDto> movieManagerList(Criteria cri);
	
	public int movieManagerGetTotalCount();

	public boolean movieManagerRegister(MovieManagerDto movieManagerDto);
	
	public List<MovieManagerDto> movieManagerGet(long movieNo);
	
	public boolean movieManagerModify(MovieManagerDto movieManagerDto);
	
	public boolean movieManagerDelete(long movieNo);
	

}
