package net.sg.beans;

import java.sql.Date;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=true)
public @Entity @Data class Tenant extends Identity {

	private Date start;
	private Date end;
	private String description;
}
