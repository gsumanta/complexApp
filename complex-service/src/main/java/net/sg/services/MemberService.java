package net.sg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sg.beans.Member;
import net.sg.query.MemberQuery;
import net.sg.repos.MemberRepo;

@Service
public class MemberService {

	@Autowired MemberRepo memberRepo;
	
	public String createMember(Member member) {	
		
		Member saved = memberRepo.save(member);
		return "Added all members";
	}

	public List<Member> getMember(MemberQuery query) {
		
		return memberRepo.findAll();		
	}

}
