package com.nova.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shop_types")
public class ShopTypes {
@Id
@Column(name="id")
private Long id;
@Column(name="type")
private String type;
@Column(name="code")
private String code;
public ShopTypes() {
	
}
public ShopTypes(Long id, String type, String code) {
	super();
	this.id = id;
	this.type = type;
	this.code = code;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
@Override
public String toString() {
	return "ShopTypes [id=" + id + ", type=" + type + ", code=" + code + "]";
}
}
