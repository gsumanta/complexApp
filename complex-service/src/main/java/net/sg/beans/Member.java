package net.sg.beans;

import static javax.persistence.CascadeType.DETACH;
import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.CascadeType.REFRESH;
import static javax.persistence.CascadeType.REMOVE;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper=true)
public @Entity @Data class Member extends Identity  {
	
	@OneToMany(cascade={PERSIST, MERGE, REMOVE, REFRESH, DETACH}) 
	private List <IdProof> idProofs;
	@ManyToMany(cascade={PERSIST, MERGE, REMOVE, REFRESH, DETACH}) 
	private List <Apartment> apartments;
	@ManyToMany(cascade={PERSIST, MERGE, REMOVE, REFRESH, DETACH}) 
	private List <Parking> parkings;
	private Boolean payableDue;
	private Boolean blocked;
	private Boolean deleted;
}
