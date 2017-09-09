package net.sg.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

public @Entity @Data class Apartment {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String flat;
	private Integer floor;
	private String tower;
	private String block;
	private Integer size;
	private String bhk;
	private String facing;
	private String description;
	private Boolean rented;
	private Boolean occupied;
	private Boolean registered;
	private Boolean mutationDone;
	private String deedNo;
	private String registrationDate;
	
	
}
