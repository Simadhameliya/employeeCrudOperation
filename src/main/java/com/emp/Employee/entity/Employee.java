package com.emp.Employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull
	@Size(min = 2,message = "First Name should have atleast 2 characters")
	@Column(name = "first_name",nullable = false)
	private String firstName;
	
	@NotNull
	@Size(min = 2, message = "Last Name should have atleast 2 characters")
	@Column(name = "last_name",nullable = false)
	private String lastName;
	
	@Email
	@NotBlank
	@Column(name = "email_address",nullable = false)
	private String emailId;
	
	@NotNull
	@Size(min = 2,message = "Passport should have atleast 2 characters")
	@Column(name = "passport_number",nullable = false)
	private String passportNumber;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(long id,String firstName,String lastName,String emailId,String passportNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.passportNumber = passportNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

}
