package com.springboot.maven;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Userdetail")
public class UserEntity 
{
	@Id
	@GeneratedValue
	private int id;
	@Column(name="fname")
	private String fname;
	@Column(name="lname")
	private String lname;
	
	public UserEntity() {
		
		// TODO Auto-generated constructor stub
	}
	
	public UserEntity(int id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	
}
