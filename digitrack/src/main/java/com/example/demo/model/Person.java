package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.example.demo.enums.GENDER;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tb_person")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "full_name", length = 60, nullable = false)
	private String fullname;

	@Column(name = "cpf", nullable = false)
	private String cpf;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	@Column(name = "birthday", nullable = false)
	private Date birthday;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = " gender", nullable = false)
	private GENDER gender;

	@Column(name = "description", nullable = false)
	private String description;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	@CreationTimestamp
	@Column(name = "CREATEDATE")
	private LocalDateTime created;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	@UpdateTimestamp
	@Column(name = "UPDATEDATE")
	private LocalDateTime updated;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public GENDER getGender() {
		return gender;
	}

	public void setGender(GENDER gender) {
		this.gender = gender;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public LocalDateTime getUpdated() {
		return updated;
	}

	public void setUpdated(LocalDateTime updated) {
		this.updated = updated;
	}

}
