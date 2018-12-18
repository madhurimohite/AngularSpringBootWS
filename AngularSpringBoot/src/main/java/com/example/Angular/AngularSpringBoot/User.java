package com.example.Angular.AngularSpringBoot;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Entity
public class User {
@Id
private Long id;
private String fname;
private String lname;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
@Override
public String toString() {
	return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + "]";
}
public User(Long id, String fname, String lname) {
	super();
	this.id = id;
	this.fname = fname;
	this.lname = lname;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}

}
