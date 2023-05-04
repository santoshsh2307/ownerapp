package com.nova.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role {
	@Id
	@Column(name="id")
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="code")
	private String code;
	@Column(name="status")
	private String status;
	public Role(long id, String name, String code, String status) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.status = status;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", code=" + code + ", status=" + status + "]";
	}

}
