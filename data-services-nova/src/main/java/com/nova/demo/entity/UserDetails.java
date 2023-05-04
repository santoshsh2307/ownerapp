package com.nova.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetails {
	@Id
	@Column(name="id")
private long id;
	@Column(name="first_name")
private String firstName;
	@Column(name="last_name")
private String lastName;
	@Column(name="username")
private String username;
	@Column(name="Password")
private String Password;
	@Column(name="mail")
private String mail;
	@Column(name="phone")
private String phone;
	@Column(name="gender")
private char gender;
@Column(name="created_at")
private boolean createdAt;
@Column(name="status")
private boolean status;
@Column(name="is_deleted")
private boolean isDeleted;
public UserDetails(long id, String firstName, String lastName, String username, String password, String mail,
		String phone, char gender, boolean createdAt, boolean status, boolean isDeleted) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.username = username;
	Password = password;
	this.mail = mail;
	this.phone = phone;
	this.gender = gender;
	this.createdAt = createdAt;
	this.status = status;
	this.isDeleted = isDeleted;
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
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
public boolean isCreatedAt() {
	return createdAt;
}
public void setCreatedAt(boolean createdAt) {
	this.createdAt = createdAt;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public boolean isDeleted() {
	return isDeleted;
}
public void setDeleted(boolean isDeleted) {
	this.isDeleted = isDeleted;
}
@Override
public String toString() {
	return "UserDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
			+ ", Password=" + Password + ", mail=" + mail + ", phone=" + phone + ", gender=" + gender + ", createdAt="
			+ createdAt + ", status=" + status + ", isDeleted=" + isDeleted + "]";
}



}
