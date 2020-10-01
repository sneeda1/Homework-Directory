package com.sw409.Patient;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Patients")
public class Patient  {
    String name;
	String gender;
	String illness;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer  id;
	

	public Patient(String name,String gender,String illness, Integer id) {
		super();
		this.gender = gender;
		this.illness = illness;
		this.name = name;
		this.id = id;
		
	}
public Patient() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getIllness() {
	return illness;
}
public void setIllness(String illness) {
	this.illness = illness;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}

}
