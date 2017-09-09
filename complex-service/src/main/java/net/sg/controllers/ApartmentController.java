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

import net.sg.beans.Apartment;
import net.sg.beans.Member;
import net.sg.query.MemberQuery;
import net.sg.services.ApartmentService;
import net.sg.services.MemberService;

@RestController
public class ApartmentController {
	
	@Autowired ApartmentService apptServ;
	
	@PostMapping(path="/api/flat")
	public ResponseEntity <String> createMember(@RequestBody @Valid Apartment appt) {
		
		return new ResponseEntity<String>(apptServ.createApartment(appt), HttpStatus.CREATED);
	}
	
	@GetMapping("/api/flat")
	public ResponseEntity <List<Apartment>> getMember(MemberQuery query) {
		
		return new ResponseEntity<List<Apartment>>(apptServ.getApartments(query), HttpStatus.OK);
	}

}
