package net.sg.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.sg.beans.PayOrder;
import net.sg.beans.Payment;
import net.sg.query.MemberQuery;
import net.sg.services.DemandService;
import net.sg.services.PaymentService;

@RestController
public class DemandController {
	
	@Autowired DemandService demandServ;
	
	@PostMapping(path="/api/demand")
	public ResponseEntity <String> createPayOrder(@RequestBody @Valid PayOrder member) {
		
		return new ResponseEntity<String>(demandServ.createDemand(member), HttpStatus.CREATED);
	}
	
	@GetMapping("/api/demand")
	public ResponseEntity <List<PayOrder>> getPayOrders(MemberQuery query) {
		
		return new ResponseEntity<List<PayOrder>>(demandServ.getDemands(query), HttpStatus.OK);
	}

}
