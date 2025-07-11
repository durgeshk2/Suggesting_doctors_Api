package com.cetpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Patient 
{
	@Id
	@GeneratedValue(generator="pat_seq")
	@SequenceGenerator(name="pat_seq", initialValue = 1001, allocationSize = 1)
	private int patid;
	@NotNull(message="Name is required")
	@Pattern(regexp="^[a-zA-Z' '].{3,}$", message="Name must have at leat three character")
	private String name;
	@NotNull(message="city is required")
	@Size(max=20, message="city should be at max20 character")
	private String city;
	@Column(unique=true,length=100)
	@NotNull(message="email is required")
	@Pattern(regexp="^^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$", message="Email is not valid")
	private String email;
	@NotNull(message="Phone number is required")
	@Pattern(regexp="^[0-9].{9,}$", message="Phone number must have 10 digits")
	private String phone;
	@NotNull(message="symptom is required")
	@Pattern(regexp="Arthritis|Back pain|Tissue injuries|Dysmenorrhea|Skin infection|skin burn|Ear pain",message="Symptom is not Valid")
	private String symptom;
	public int getPatid() {
		return patid;
	}
	public void setPatid(int patid) {
		this.patid = patid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSymptom() {
		return symptom;
	}
	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}
	

}
