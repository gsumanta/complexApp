package net.sg.beans;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

public @Entity @Data class PayOrder {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	private Double amount;
	private Boolean due;
	private Date orderDate;
	private Date dueDate;
	private String description;
	@OneToOne(targetEntity=Apartment.class, fetch=FetchType.EAGER)
	@JoinColumn(name = "apartment_id")
	private Long apartmentId;
	@OneToOne(targetEntity=Member.class, fetch=FetchType.EAGER)
	@JoinColumn(name = "member_id")
	private Long memberId;
	
}
