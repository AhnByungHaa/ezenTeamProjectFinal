package com.cinema.mapper.manager.customer;

import java.util.List;

import com.cinema.repository.criteria.Criteria;
import com.cinema.repository.customer.AnswerDto;
import com.cinema.repository.customer.QuestionDto;

public interface CustomerManagerMapper {
	
	public List<QuestionDto> questionManagerList(Criteria cri);
	
	public List<AnswerDto> answerManagerList(Criteria cri);
	
	public int answerManagerGetTotalCount();
	
	public int questionManagerGetTotalCount();
	
	public List<QuestionDto> questionManagerGet(long questionNo);
	
	public List<AnswerDto> answerManagerGet(long answerNo);

	public boolean answerManagerRegister(AnswerDto answerDto);
	
}