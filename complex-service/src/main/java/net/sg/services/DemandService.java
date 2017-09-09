package net.sg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sg.beans.PayOrder;
import net.sg.query.MemberQuery;
import net.sg.repos.PayOrderRepo;

@Service
public class DemandService {

	@Autowired PayOrderRepo payOrderRepo;
	
	public String createDemand(PayOrder order) {
		
		payOrderRepo.save(order);
		return "Pay Order Demand created";
	}

	public List<PayOrder> getDemands(MemberQuery query) {
		
		return payOrderRepo.findAll();
	}

}
