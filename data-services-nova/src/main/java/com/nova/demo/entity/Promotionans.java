package com.nova.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="promotionans")
public class Promotionans {
	@Id
	@Column(name="id")
	private Long id;
	@Column(name="shop_id")
	private Long shopId;
	@Column(name="is_percentage")
	private Boolean isPercentage;
	@Column(name="is_amount")
	private Boolean isAmount;
	@Column(name="percentage_value")
	private Long percentageValue;
	@Column(name="amount_value")
	private Float amountValue;
	@Column(name="start_date")
	private LocalDateTime startDate;
	@Column(name="end_date")
	private LocalDateTime endDate;
	@Column(name="promotion_name")
	private String promotionName;
	@Column(name="min_service_count")
	private Long minServiceCount;
	public Promotionans() {
		
	}
	public Promotionans(Long id, Long shopId, Boolean isPercentage, Boolean isAmount, Long percentageValue,
			Float amountValue, LocalDateTime startDate, LocalDateTime endDate, String promotionName,
			Long minServiceCount) {
		super();
		this.id = id;
		this.shopId = shopId;
		this.isPercentage = isPercentage;
		this.isAmount = isAmount;
		this.percentageValue = percentageValue;
		this.amountValue = amountValue;
		this.startDate = startDate;
		this.endDate = endDate;
		this.promotionName = promotionName;
		this.minServiceCount = minServiceCount;
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
	public Boolean getIsPercentage() {
		return isPercentage;
	}
	public void setIsPercentage(Boolean isPercentage) {
		this.isPercentage = isPercentage;
	}
	public Boolean getIsAmount() {
		return isAmount;
	}
	public void setIsAmount(Boolean isAmount) {
		this.isAmount = isAmount;
	}
	public Long getPercentageValue() {
		return percentageValue;
	}
	public void setPercentageValue(Long percentageValue) {
		this.percentageValue = percentageValue;
	}
	public Float getAmountValue() {
		return amountValue;
	}
	public void setAmountValue(Float amountValue) {
		this.amountValue = amountValue;
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
	public String getPromotionName() {
		return promotionName;
	}
	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}
	public Long getMinServiceCount() {
		return minServiceCount;
	}
	public void setMinServiceCount(Long minServiceCount) {
		this.minServiceCount = minServiceCount;
	}
	@Override
	public String toString() {
		return "Promotionans [id=" + id + ", shopId=" + shopId + ", isPercentage=" + isPercentage + ", isAmount="
				+ isAmount + ", percentageValue=" + percentageValue + ", amountValue=" + amountValue + ", startDate="
				+ startDate + ", endDate=" + endDate + ", promotionName=" + promotionName + ", minServiceCount="
				+ minServiceCount + "]";
	}

}
