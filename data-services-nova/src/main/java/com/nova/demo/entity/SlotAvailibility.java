package com.nova.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="slot_availibility")
public class SlotAvailibility {
	@Id
	@Column(name="id")
	private Long id;
	@Column(name="time")
	private LocalDateTime time;
	@Column(name="app_status")
	private String appStatus;
	@Column(name="status")
	private Boolean status;
	@Column(name="is_deleted")
	private Boolean isDeleted;
	@Column(name="app_created_date")
	private LocalDateTime appCreatedDate;
	@Column(name="shop_id")
	private Long shopId;
	@Column(name="consumer_id")
	private Long consumerId;
	@Column(name="reson_for_calncel")
	private String resonForCalncel;
	@Column(name="updated_date")
	private LocalDateTime updatedDate;
	public SlotAvailibility() {
		
	}
	public SlotAvailibility(Long id, LocalDateTime time, String appStatus, Boolean status, Boolean isDeleted,
			LocalDateTime appCreatedDate, Long shopId, Long consumerId, String resonForCalncel,
			LocalDateTime updatedDate) {
		super();
		this.id = id;
		this.time = time;
		this.appStatus = appStatus;
		this.status = status;
		this.isDeleted = isDeleted;
		this.appCreatedDate = appCreatedDate;
		this.shopId = shopId;
		this.consumerId = consumerId;
		this.resonForCalncel = resonForCalncel;
		this.updatedDate = updatedDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public String getAppStatus() {
		return appStatus;
	}
	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
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
	public LocalDateTime getAppCreatedDate() {
		return appCreatedDate;
	}
	public void setAppCreatedDate(LocalDateTime appCreatedDate) {
		this.appCreatedDate = appCreatedDate;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public Long getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(Long consumerId) {
		this.consumerId = consumerId;
	}
	public String getResonForCalncel() {
		return resonForCalncel;
	}
	public void setResonForCalncel(String resonForCalncel) {
		this.resonForCalncel = resonForCalncel;
	}
	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}
	
	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "SlotAvailibility [id=" + id + ", time=" + time + ", appStatus=" + appStatus + ", status=" + status
				+ ", isDeleted=" + isDeleted + ", appCreatedDate=" + appCreatedDate + ", shopId=" + shopId
				+ ", consumerId=" + consumerId + ", resonForCalncel=" + resonForCalncel + ", updatedDate=" + updatedDate
				+ "]";
	}

}
