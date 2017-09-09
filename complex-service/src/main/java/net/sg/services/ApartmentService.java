package net.sg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sg.beans.Apartment;
import net.sg.query.MemberQuery;
import net.sg.repos.ApartmentRepo;

@Service
public class ApartmentService {

	@Autowired ApartmentRepo apptRepo;
	
	public String createApartment(Apartment appt) {
		Apartment saved = apptRepo.save(appt);
		return "Apartment created";
	}

	public List<Apartment> getApartments(MemberQuery query) {
		
		return apptRepo.findAll();
	}

}
