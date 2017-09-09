package net.sg.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;

import net.sg.beans.Member;
import net.sg.query.MemberQuery;
import net.sg.services.MemberService;

@RestController
public class MemberController {
	
	@Autowired MemberService memberServ;
	
	@PostMapping(path="/api/member")
	public ResponseEntity <String> createMember(@RequestBody @Valid Member member) {
		
		return new ResponseEntity<String>(memberServ.createMember(member), HttpStatus.CREATED);
	}
	
	@GetMapping("/api/member")
	public ResponseEntity <List<Member>> getMember(MemberQuery query) {
		
		return new ResponseEntity<List<Member>>(memberServ.getMember(query), HttpStatus.OK);
	}

}
