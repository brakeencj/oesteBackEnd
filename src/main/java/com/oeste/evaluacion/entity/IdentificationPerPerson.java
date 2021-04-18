package com.oeste.evaluacion.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "identificationPerson_schema")
public class IdentificationPerPerson implements Serializable{

	private static final long serialVersionUID = -7034211576380278871L;

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@Column(length = 50, nullable = false)
	private String idPerson;
	
	@Column(length = 50, nullable = false)
	private String idIdentification;
	
	private Date createAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(String idPerson) {
		this.idPerson = idPerson;
	}

	public String getIdIdentification() {
		return idIdentification;
	}

	public void setIdIdentification(String idIdentification) {
		this.idIdentification = idIdentification;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	
	
	
}
