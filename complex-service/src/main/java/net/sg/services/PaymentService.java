package net.sg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sg.beans.Payment;
import net.sg.query.MemberQuery;
import net.sg.repos.PaymentRepo;

@Service
public class PaymentService {

	@Autowired PaymentRepo paymentRepo;
	
	public String createPayment(Payment payment) {
		
		paymentRepo.save(payment);
		return "Payment created";
	}

	public List<Payment> getPayments(MemberQuery query) {
		
		return paymentRepo.findAll();
	}

}
