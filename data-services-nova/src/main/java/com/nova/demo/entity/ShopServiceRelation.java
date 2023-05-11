package com.nova.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shop_service_relation")
public class ShopServiceRelation {
@Id
@Column(name="id")
private Long id;
@Column(name="shop_id")
private Long shopId;
@Column(name="service_id")
private Long serviceId;
@Column(name="Status")
private Boolean Status;
@Column(name="is_deleted")
private Boolean isDeleted;
@Column(name="price")
private Float price;
public ShopServiceRelation() {
	
}
public ShopServiceRelation(Long id, Long shopId, Long serviceId, Boolean status, Boolean isDeleted, Float price) {
	super();
	this.id = id;
	this.shopId = shopId;
	this.serviceId = serviceId;
	Status = status;
	this.isDeleted = isDeleted;
	this.price = price;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Long getShopId() {
	return shopId;
}
public void setShopId(Long shopId) {
	this.shopId = shopId;
}
public Long getServiceId() {
	return serviceId;
}
public void setServiceId(Long serviceId) {
	this.serviceId = serviceId;
}
public Boolean getStatus() {
	return Status;
}
public void setStatus(Boolean status) {
	Status = status;
}
public Boolean getIsDeleted() {
	return isDeleted;
}
public void setIsDeleted(Boolean isDeleted) {
	this.isDeleted = isDeleted;
}
public Float getPrice() {
	return price;
}
public void setPrice(Float price) {
	this.price = price;
}
@Override
public String toString() {
	return "ShopServiceRelation [id=" + id + ", shopId=" + shopId + ", serviceId=" + serviceId + ", Status=" + Status
			+ ", isDeleted=" + isDeleted + ", price=" + price + "]";
}
}
