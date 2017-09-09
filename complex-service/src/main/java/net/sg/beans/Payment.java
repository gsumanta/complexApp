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

public @Entity @Data class Payment {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	@OneToOne(targetEntity=PayOrder.class, fetch=FetchType.EAGER)
	@JoinColumn(name = "pay_order_id")
	private Long payOrderId;
	
	private Double amountPaid;
	private Double amountDue;
	private Date paymentDate;
	private String paymentMode;
	private String chequeNo;
	private String chequeDetails;
	private String neftNo;
	private String neftDetails;
	private String cashDetails;
	private Boolean failed;
	
}
