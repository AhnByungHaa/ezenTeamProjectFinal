package com.cinema.service.manager.comment;

import java.util.List;

import com.cinema.repository.comment.CommentManagerResultMap;
import com.cinema.repository.criteria.Criteria;

public interface CommentManagerService {

	public List<CommentManagerResultMap> commentManagerList(Criteria cri);

	public int commentManagerGetTotalCount();

	public boolean commentManagerDelete(long commentNo);

}
