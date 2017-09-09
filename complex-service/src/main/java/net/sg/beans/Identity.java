package net.sg.beans;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.validator.constraints.Email;

import lombok.Data;

@MappedSuperclass
public @Data class Identity {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	protected String fName;
	protected String lName;	
	protected Integer age;	
	protected @Email String email;
	protected String phone;
	protected String address;
	protected String city;
	protected String country;
	protected Long zip;
	protected Byte photo;
	protected String occupation;
	protected String designation;
	protected String organization;
	protected Date dob;
	protected String education;
	
}
