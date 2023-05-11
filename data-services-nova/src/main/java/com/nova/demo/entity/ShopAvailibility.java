package com.nova.demo.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shop_availibility")
public class ShopAvailibility {
@Id
@Column(name="id")
private Long id;
@Column(name="from_date")
private LocalDateTime fromDate;
@Column(name="to_date")
private LocalDateTime toDate;
@Column(name="from_time")
private LocalTime fromTime;
@Column(name="to_time")
private LocalTime toTime;
@Column(name="interval")
private LocalTime interval;
@Column(name="shop_id")
private Long shopId;
@Column(name="status")
private String status;
@Column(name="is_deleted")
private String isDeleted;

public ShopAvailibility() {
	
}

public ShopAvailibility(Long id, LocalDateTime fromDate, LocalDateTime toDate, LocalTime fromTime, LocalTime toTime,
		LocalTime interval, Long shopId, String status, String isDeleted) {
	super();
	this.id = id;
	this.fromDate = fromDate;
	this.toDate = toDate;
	this.fromTime = fromTime;
	this.toTime = toTime;
	this.interval = interval;
	this.shopId = shopId;
	this.status = status;
	this.isDeleted = isDeleted;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public LocalDateTime getFromDate() {
	return fromDate;
}

public void setFromDate(LocalDateTime fromDate) {
	this.fromDate = fromDate;
}

public LocalDateTime getToDate() {
	return toDate;
}

public void setToDate(LocalDateTime toDate) {
	this.toDate = toDate;
}

public LocalTime getFromTime() {
	return fromTime;
}

public void setFromTime(LocalTime fromTime) {
	this.fromTime = fromTime;
}

public LocalTime getToTime() {
	return toTime;
}

public void setToTime(LocalTime toTime) {
	this.toTime = toTime;
}

public LocalTime getInterval() {
	return interval;
}

public void setInterval(LocalTime interval) {
	this.interval = interval;
}

public Long getShopId() {
	return shopId;
}

public void setShopId(Long shopId) {
	this.shopId = shopId;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getIsDeleted() {
	return isDeleted;
}

public void setIsDeleted(String isDeleted) {
	this.isDeleted = isDeleted;
}

@Override
public String toString() {
	return "ShopAvailibility [id=" + id + ", fromDate=" + fromDate + ", toDate=" + toDate + ", fromTime=" + fromTime
			+ ", toTime=" + toTime + ", interval=" + interval + ", shopId=" + shopId + ", status=" + status
			+ ", isDeleted=" + isDeleted + "]";
}
}
