package com.session.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BankExecutive {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private String EmpCode;

@OneToOne
private User user;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmpCode() {
	return EmpCode;
}

public void setEmpCode(String empCode) {
	EmpCode = empCode;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

@Override
public String toString() {
	return "BankExecutive [id=" + id + ", name=" + name + ", EmpCode=" + EmpCode + ", user=" + user + "]";
}

}
