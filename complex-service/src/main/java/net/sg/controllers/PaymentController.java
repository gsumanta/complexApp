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

import net.sg.beans.Payment;
import net.sg.query.MemberQuery;
import net.sg.services.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired PaymentService paymentServ;
	
	@PostMapping(path="/api/payment")
	public ResponseEntity <String> createPayment(@RequestBody @Valid Payment member) {
		
		return new ResponseEntity<String>(paymentServ.createPayment(member), HttpStatus.CREATED);
	}
	
	@GetMapping("/api/payment")
	public ResponseEntity <List<Payment>> getPayments(MemberQuery query) {
		
		return new ResponseEntity<List<Payment>>(paymentServ.getPayments(query), HttpStatus.OK);
	}

}
