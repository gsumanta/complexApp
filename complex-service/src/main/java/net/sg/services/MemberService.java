package net.sg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import net.sg.beans.IdProof;
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
		
		List<Member> members = Lists.newArrayList();
		members.add(Member.builder()
						  .fName("Sumanta")
						  .lName("Sumanta")
						  .city("kolkata")
						  .country("IN")
						  .address("Newtown")
						  .zip(700156l)
						  .email("sumanta@gmailc.om")
						  .phone("9876543210")
						  .idProofs(Lists.newArrayList(IdProof.builder()
								  		   .idProofName("EPIC")
								  		   .idProofNumber("S7729")
								  		   .idProofDescription("Very nice id proof")
								  		   .build()))
						  .build());
		return members;
	}

}
