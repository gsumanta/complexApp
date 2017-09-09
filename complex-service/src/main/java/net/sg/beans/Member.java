package net.sg.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import static javax.persistence.CascadeType.*;
import org.hibernate.validator.constraints.Email;

import lombok.Builder;
import lombok.Data;

public @Entity @Data @Builder class Member {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String fName;
	private String lName;	
	private Integer age;	
	private @Email String email;
	private String phone;
	private String address;
	private String city;
	private String country;
	private Long zip;
	private Byte photo;
	@OneToMany(cascade={PERSIST, MERGE, REMOVE, REFRESH, DETACH}) 
	private List <IdProof> idProofs;

}
