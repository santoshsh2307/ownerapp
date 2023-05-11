package com.nova.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shop_ratings")
public class ShopRatings {
	@Id
	@Column(name="id")
	private Long id;
	@Column(name="shop_id")
	private Long shopId;
	@Column(name="consumer_id")
	private Long consumerId;
	@Column(name="ratings")
	private Float ratings;
	@Column(name="comments")
	private String comments;
public ShopRatings() {
	
}
public ShopRatings(Long id, Long shopId, Long consumerId, Float ratings, String comments) {
	super();
	this.id = id;
	this.shopId = shopId;
	this.consumerId = consumerId;
	this.ratings = ratings;
	this.comments = comments;

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
public Long getConsumerId() {
	return consumerId;
}
public void setConsumerId(Long consumerId) {
	this.consumerId = consumerId;
}
public Float getRatings() {
	return ratings;
}
public void setRatings(Float ratings) {
	this.ratings = ratings;
}
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}

@Override
public String toString() {
	return "ShopRatings [id=" + id + ", shopId=" + shopId + ", consumerId=" + consumerId + ", ratings=" + ratings
			+ ", comments=" + comments + "]";
}}
