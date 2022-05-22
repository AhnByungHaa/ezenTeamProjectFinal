package com.cinema.service.manager.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.mapper.manager.comment.CommentManagerMapper;
import com.cinema.repository.comment.CommentManagerDto;
import com.cinema.repository.comment.CommentManagerResultMap;
import com.cinema.repository.criteria.Criteria;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
@NoArgsConstructor
public class CommentManagerServiceImpl implements CommentManagerService {
	
	@Autowired(required = false)
	private CommentManagerMapper commentManagerMapper;
	
	@Override
	public List<CommentManagerResultMap> commentManagerList(Criteria cri) {
		return commentManagerMapper.commentManagerList(cri);
	}
	
	public int commentManagerGetTotalCount() {
		return commentManagerMapper.commentManagerGetTotalCount();
	}

	@Override
	public boolean commentManagerDelete(long commentNo) {
		return commentManagerMapper.commentManagerDelete(commentNo);
	}

}
