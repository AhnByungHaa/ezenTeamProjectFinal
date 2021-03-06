package com.cinema.service.manager.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.mapper.manager.notice.NoticeManagerMapper;
import com.cinema.repository.criteria.Criteria;
import com.cinema.repository.notice.NoticeManagerDto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
@NoArgsConstructor
public class NoticeManagerServiceImpl implements NoticeManagerService {

	@Autowired
	NoticeManagerMapper noticeManagerMapper;
	
	@Override
	public boolean noticeManagerRegister(NoticeManagerDto noticeManagerDto) {
		return noticeManagerMapper.noticeManagerRegister(noticeManagerDto);
	}

	@Override
	public List<NoticeManagerDto> noticeManagerList(Criteria cri) {
		return noticeManagerMapper.noticeManagerList(cri);
	}

	@Override
	public int noticeManagerGetTotalCount() {
		return noticeManagerMapper.noticeManagerGetTotalCount();
	}

	@Override
	public List<NoticeManagerDto> noticeManagerGet(long noticeNo) {
		return noticeManagerMapper.noticeManagerGet(noticeNo);
	}

	@Override
	public boolean noticeManagerModify(NoticeManagerDto noticeManagerDto) {
		return noticeManagerMapper.noticeManagerModify(noticeManagerDto);
	}

	@Override
	public boolean noticeManagerDelete(long noticeNo) {
		return noticeManagerMapper.noticeManagerDelete(noticeNo);
	}

}
