package com.shop.site.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class OrderStatus {

	int OrderStatusId;
	
	String OrdrStatusDesc;

	public int getOrderStatusId() {

		return OrderStatusId;
	}

	public void setOrderStatusId(int orderStatusId) {
		OrderStatusId = orderStatusId;
	}

	public String getOrdrStatusDesc() {
		return OrdrStatusDesc;
	}

	public void setOrdrStatusDesc(String ordrStatusDesc) {
		OrdrStatusDesc = ordrStatusDesc;
	}

	

}
