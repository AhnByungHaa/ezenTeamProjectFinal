package com.cinema.service.manager.member;

import java.util.List;

import com.cinema.repository.criteria.Criteria;
import com.cinema.repository.member.MemberManagerDto;

public interface MemberManagerService {
	
	public List<MemberManagerDto> memberList(Criteria cri);
	
	public int memberGetTotal();
	
	public List<MemberManagerDto> memberGet(long memberNo);
	
	public boolean memberModify(MemberManagerDto memberManagerDto);
	
}
