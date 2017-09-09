package net.sg.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

public @Entity @Data @Builder class IdProof {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String idProofName;
	private String idProofNumber;
	private Byte idProofPhoto;
	private String idProofDescription;
}
