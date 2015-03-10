package com.shop.site.model;

import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class OrderDtls {

	int OrderId;
	
	String OrderDesc;
	
	Date rowCreDt;
	
	Date rowUpdDt;
	
	OrderStatus orderStatus; 
	
	ProductDtls productDtls;
	
	Boolean DelIndc;

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public String getOrderDesc() {
		return OrderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		OrderDesc = orderDesc;
	}

	public Date getRowCreDt() {
		return rowCreDt;
	}

	public void setRowCreDt(Date rowCreDt) {
		this.rowCreDt = rowCreDt;
	}

	public Date getRowUpdDt() {
		return rowUpdDt;
	}

	public void setRowUpdDt(Date rowUpdDt) {
		this.rowUpdDt = rowUpdDt;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public ProductDtls getProductDtls() {
		return productDtls;
	}

	public void setProductDtls(ProductDtls productDtls) {
		this.productDtls = productDtls;
	}

	public Boolean getDelIndc() {
		return DelIndc;
	}

	public void setDelIndc(Boolean delIndc) {
		DelIndc = delIndc;
	}
	
}
