package com.nova.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shop_details")
public class ShopDetails {
@Id
@Column(name="id")
private Long id;
@Column(name="shop_name")
private String shopName;
@Column(name="shop_address")
private String shopAddress;
@Column(name="latitude")
private String latitude;
@Column(name="logitude")
private String logitude;
@Column(name="email")
private String mail;
@Column(name="Phone")
private String Phone;
@Column(name="logo")
private String logo;
@Column(name="created_at")
private LocalDateTime createdAt;
@Column(name="status")
private Boolean status;
@Column(name="is_deleted")
private Boolean isDeleted;
@Column(name="shop_type")
private Long shopType;
public ShopDetails() {
	
}
public ShopDetails(Long id, String shopName, String shopAddress, String latitude, String logitude, String mail,
		String phone, String logo, LocalDateTime createdAt, Boolean status, Boolean isDeleted, Long shopType) {
	super();
	this.id = id;
	this.shopName = shopName;
	this.shopAddress = shopAddress;
	this.latitude = latitude;
	this.logitude = logitude;
	this.mail = mail;
	Phone = phone;
	this.logo = logo;
	this.createdAt = createdAt;
	this.status = status;
	this.isDeleted = isDeleted;
	this.shopType = shopType;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getShopName() {
	return shopName;
}
public void setShopName(String shopName) {
	this.shopName = shopName;
}
public String getShopAddress() {
	return shopAddress;
}
public void setShopAddress(String shopAddress) {
	this.shopAddress = shopAddress;
}
public String getLatitude() {
	return latitude;
}
public void setLatitude(String latitude) {
	this.latitude = latitude;
}
public String getLogitude() {
	return logitude;
}
public void setLogitude(String logitude) {
	this.logitude = logitude;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getPhone() {
	return Phone;
}
public void setPhone(String phone) {
	Phone = phone;
}
public String getLogo() {
	return logo;
}
public void setLogo(String logo) {
	this.logo = logo;
}
public LocalDateTime getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(LocalDateTime createdAt) {
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
public Long getShopType() {
	return shopType;
}
public void setShopType(Long shopType) {
	this.shopType = shopType;
}
@Override
public String toString() {
	return "ShopDetails [id=" + id + ", shopName=" + shopName + ", shopAddress=" + shopAddress + ", latitude="
			+ latitude + ", logitude=" + logitude + ", mail=" + mail + ", Phone=" + Phone + ", logo=" + logo
			+ ", createdAt=" + createdAt + ", status=" + status + ", isDeleted=" + isDeleted + ", shopType=" + shopType
			+ "]";
}
}
