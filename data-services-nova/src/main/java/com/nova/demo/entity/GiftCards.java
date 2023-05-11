package com.nova.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gift_cards")
public class GiftCards {
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="created_by")
	private Long createdBy;
	@Column(name="gift_amount")
	private Float giftAmount;
	@Column(name="gift_percentage")
	private Long  giftPercentage;
	@Column(name="is_amount")
	private Boolean isAmount;
	@Column(name="is_percentage")
	private Boolean isPercentage;
	@Column(name="gift_code")
	private String giftCode;
	@Column(name="start_date")
	private LocalDateTime startDate;
	@Column(name="end_date")
	private LocalDateTime endDate;
	@Column(name="status")
	private Boolean status;
	@Column(name="isDeleted")
	private Boolean is_deleted;
	@Column(name="shop_list")
	private String shopList;
public GiftCards() {	
	
}
public GiftCards(Integer id, Long createdBy, Float giftAmount, Long giftPercentage, Boolean isAmount,
		Boolean isPercentage, String giftCode, LocalDateTime startDate, LocalDateTime endDate, Boolean status,
		Boolean is_deleted, String shopList) {
	super();
	this.id = id;
	this.createdBy = createdBy;
	this.giftAmount = giftAmount;
	this.giftPercentage = giftPercentage;
	this.isAmount = isAmount;
	this.isPercentage = isPercentage;
	this.giftCode = giftCode;
	this.startDate = startDate;
	this.endDate = endDate;
	this.status = status;
	this.is_deleted = is_deleted;
	this.shopList = shopList;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Long getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(Long createdBy) {
	this.createdBy = createdBy;
}
public Float getGiftAmount() {
	return giftAmount;
}
public void setGiftAmount(Float giftAmount) {
	this.giftAmount = giftAmount;
}
public Long getGiftPercentage() {
	return giftPercentage;
}
public void setGiftPercentage(Long giftPercentage) {
	this.giftPercentage = giftPercentage;
}
public Boolean getIsAmount() {
	return isAmount;
}
public void setIsAmount(Boolean isAmount) {
	this.isAmount = isAmount;
}
public Boolean getIsPercentage() {
	return isPercentage;
}
public void setIsPercentage(Boolean isPercentage) {
	this.isPercentage = isPercentage;
}
public String getGiftCode() {
	return giftCode;
}
public void setGiftCode(String giftCode) {
	this.giftCode = giftCode;
}
public LocalDateTime getStartDate() {
	return startDate;
}
public void setStartDate(LocalDateTime startDate) {
	this.startDate = startDate;
}
public LocalDateTime getEndDate() {
	return endDate;
}
public void setEndDate(LocalDateTime endDate) {
	this.endDate = endDate;
}
public Boolean getStatus() {
	return status;
}
public void setStatus(Boolean status) {
	this.status = status;
}
public Boolean getIs_deleted() {
	return is_deleted;
}
public void setIs_deleted(Boolean is_deleted) {
	this.is_deleted = is_deleted;
}
public String getShopList() {
	return shopList;
}
public void setShopList(String shopList) {
	this.shopList = shopList;
}
@Override
public String toString() {
	return "GiftCards [id=" + id + ", createdBy=" + createdBy + ", giftAmount=" + giftAmount + ", giftPercentage="
			+ giftPercentage + ", isAmount=" + isAmount + ", isPercentage=" + isPercentage + ", giftCode=" + giftCode
			+ ", startDate=" + startDate + ", endDate=" + endDate + ", status=" + status + ", is_deleted=" + is_deleted
			+ ", shopList=" + shopList + "]";
}
	

}
