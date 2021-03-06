package com.cinema.service.manager.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.mapper.manager.movie.MovieManagerMapper;
import com.cinema.repository.criteria.Criteria;
import com.cinema.repository.movie.MovieManagerDto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
@NoArgsConstructor
public class MovieManagerServiceImpl implements MovieManagerService {

	@Autowired(required = false)
	private MovieManagerDto movieManagerDto;
	
	@Autowired(required = false)
	private MovieManagerMapper movieManagerMapper;
	
	@Override
	public List<MovieManagerDto> movieManagerList(Criteria cri) {
		return movieManagerMapper.movieManagerList(cri);
	}
	
	public int movieManagerGetTotalCount() {
		return movieManagerMapper.movieManagerGetTotalCount();
	}
	
	public boolean movieManagerRegister(MovieManagerDto movieManagerDto) {
		return movieManagerMapper.movieManagerRegister(movieManagerDto);
	}

	@Override
	public List<MovieManagerDto> movieManagerGet(long movieNo) {
		return movieManagerMapper.movieManagerGet(movieNo);
	}

	@Override
	public boolean movieManagerModify(MovieManagerDto movieManagerDto) {
		return movieManagerMapper.movieManagerModify(movieManagerDto);
	}

	@Override
	public boolean movieManagerDelete(long movieNo) {
		return movieManagerMapper.movieManagerDelete(movieNo);
	}

}
