package com.cinema.mapper.manager.member;

import java.util.List;

import com.cinema.repository.criteria.Criteria;
import com.cinema.repository.member.MemberManagerDto;

public interface MemberManagerMapper {
	
	public List<MemberManagerDto> memberGetListWithPaging(Criteria cri);
	
	public int memberGetTotalCount();
	
	public List<MemberManagerDto> memberGet(long memberNo);
	
	public boolean memberModify(MemberManagerDto memberManagerDto);
	
}
