package net.sg.beans;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

public @Entity @Data class Parking {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String number;
	private String type;
	private Integer size;
	private String description;
	private Boolean guestParking;
	private Date registrationDate;
}
