package com.cinema.service.manager.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.mapper.manager.member.MemberManagerMapper;
import com.cinema.repository.criteria.Criteria;
import com.cinema.repository.member.MemberManagerDto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
@NoArgsConstructor
public class MemberManagerServiceImpl implements MemberManagerService {

	@Autowired(required = false)
	MemberManagerMapper memberManagerMapper;
	
	@Autowired(required = false)
	MemberManagerDto memberManagerDto;

	@Override
	public List<MemberManagerDto> memberList(Criteria cri) {
		return memberManagerMapper.memberGetListWithPaging(cri);
	}

	@Override
	public int memberGetTotal() {
		return memberManagerMapper.memberGetTotalCount();
	}

	@Override
	public List<MemberManagerDto> memberGet(long memberNo) {
		return memberManagerMapper.memberGet(memberNo);
	}

	@Override
	public boolean memberModify(MemberManagerDto memberManagerDto) {
		return memberManagerMapper.memberModify(memberManagerDto);
	}

}
