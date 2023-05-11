package com.nova.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appointment_details")
public class AppointmentDetails {
	@Id
	@Column(name="id")
private Long id;
	@Column(name="consumer_id")
private Long consumerId;
	@Column(name="shop_id")
private Long shopId;
	@Column(name="service_id")
private Long serviceId;
	@Column(name="slot_id")
private Long slotId;
	@Column(name="status")
private Boolean status;
	@Column(name="is_deleted")
private Boolean isDeleted;
	@Column(name="created_at")
private LocalDateTime createdAt;
	@Column(name="updated_at")
private LocalDateTime updatedAt;
	public AppointmentDetails() {
		
	}
	public AppointmentDetails(Long id, Long consumerId, Long shopId, Long serviceId, Long slotId, Boolean status,
			Boolean isDeleted, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.consumerId = consumerId;
		this.shopId = shopId;
		this.serviceId = serviceId;
		this.slotId = slotId;
		this.status = status;
		this.isDeleted = isDeleted;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(Long consumerId) {
		this.consumerId = consumerId;
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
	public Long getSlotId() {
		return slotId;
	}
	public void setSlotId(Long slotId) {
		this.slotId = slotId;
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
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	@Override
	public String toString() {
		return "AppointmentDetails [id=" + id + ", consumerId=" + consumerId + ", shopId=" + shopId + ", serviceId="
				+ serviceId + ", slotId=" + slotId + ", status=" + status + ", isDeleted=" + isDeleted + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + "]";
	}

}
