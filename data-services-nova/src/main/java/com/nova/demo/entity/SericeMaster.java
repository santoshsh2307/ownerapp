package com.nova.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="serice_master")
public class SericeMaster {
	@Id
	@Column(name="id")
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="shop_type_id")
	private Long shopTypeId;
	@Column(name="status")
	private Boolean status;
	@Column(name="is_deleted")
	private Boolean isDeleted;
	
public SericeMaster() {
	
}

public SericeMaster(Long id, String name, Long shopTypeId, Boolean status, Boolean isDeleted) {
	super();
	this.id = id;
	this.name = name;
	this.shopTypeId = shopTypeId;
	this.status = status;
	this.isDeleted = isDeleted;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Long getShopTypeId() {
	return shopTypeId;
}

public void setShopTypeId(Long shopTypeId) {
	this.shopTypeId = shopTypeId;
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

@Override
public String toString() {
	return "SericeMaster [id=" + id + ", name=" + name + ", shopTypeId=" + shopTypeId + ", status=" + status
			+ ", isDeleted=" + isDeleted + "]";
}
}
