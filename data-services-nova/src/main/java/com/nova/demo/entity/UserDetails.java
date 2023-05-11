package com.nova.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetails {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
	@Column(name="first_name")
private String firstName;
	@Column(name="last_name")
private String lastName;
	@Column(name="user_name")
private String username;
	@Column(name="password")
private String Password;
	@Column(name="email")
private String mail;
	@Column(name="phone")
private String phone;
	@Column(name="gender")
private String gender;
	@Column(name="role_id")
private Integer roleId;
@Column(name="created_at")
private Boolean createdAt;
@Column(name="status")
private Boolean status;
@Column(name="is_deleted")
private Boolean isDeleted;
@Column(name="owner_id")
private Long ownerId;
public UserDetails() {
	
}
public UserDetails(Long id, String firstName, String lastName, String username, String password, String mail,
		String phone, String gender, Integer roleId, Boolean createdAt, Boolean status, Boolean isDeleted,
		Long ownerId) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.username = username;
	Password = password;
	this.mail = mail;
	this.phone = phone;
	this.gender = gender;
	this.roleId = roleId;
	this.createdAt = createdAt;
	this.status = status;
	this.isDeleted = isDeleted;
	this.ownerId = ownerId;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
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
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Integer getRoleId() {
	return roleId;
}
public void setRoleId(Integer roleId) {
	this.roleId = roleId;
}
public Boolean getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(Boolean createdAt) {
	this.createdAt = createdAt;
}
public Boolean getStatus() {
	return status;
}
public void setStatus(Boolean status) {
	this.status = status;
}
public Boolean getIsDeleted() {
	return isDeleted;
}
public void setIsDeleted(Boolean isDeleted) {
	this.isDeleted = isDeleted;
}
public Long getOwnerId() {
	return ownerId;
}
public void setOwnerId(Long ownerId) {
	this.ownerId = ownerId;
}
@Override
public String toString() {
	return "UserDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
			+ ", Password=" + Password + ", mail=" + mail + ", phone=" + phone + ", gender=" + gender + ", roleId="
			+ roleId + ", createdAt=" + createdAt + ", status=" + status + ", isDeleted=" + isDeleted + ", ownerId="
			+ ownerId + "]";
}

}