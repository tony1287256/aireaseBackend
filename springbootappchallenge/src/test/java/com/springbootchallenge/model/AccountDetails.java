package com.springbootchallenge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountDetails {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String dateOfCreation;

}