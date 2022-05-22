package com.cinema.mapper.manager.comment;

import java.util.List;

import com.cinema.repository.comment.CommentManagerResultMap;
import com.cinema.repository.criteria.Criteria;

public interface CommentManagerMapper {

	public List<CommentManagerResultMap> commentManagerList(Criteria cri);
	
	public int commentManagerGetTotalCount();
	
	public boolean commentManagerDelete(long commentNo);
	
}
