package net.sg.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

public @Data @Entity class Vehicle {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String regNo;
	private String description;
	private String stickerNo;
	private Boolean blocked;
}
