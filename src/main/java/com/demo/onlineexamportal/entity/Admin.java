package com.demo.onlineexamportal.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int admin_id;
	private char name;
	private String address;
	private String mail;
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Admin( char name, String address, String mail, int admin_id) {
		// TODO Auto-generated constructor stub

		super();
		this.admin_id = admin_id;
		this.name = name;
		this.address = address;
		this.mail = mail;
	}

	public Admin() {
		// TODO Auto-generated constructor stub
	}

	@OneToMany(targetEntity = User.class, cascade = CascadeType.ALL)
	public int getadmin_id() {
		return admin_id;
	}
	public void setadmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", name=" + name + ", Address=" + address + ", mail=" + mail + "]";
	}

	
}