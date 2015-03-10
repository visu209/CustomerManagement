package com.shop.site.model;

import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class OrderProductMapping {

	OrderDtls orderDtls;
	
	ProductDtls productDtls;
	
	Date rowCreDt;
	
	Date rowUpdDt;
	
	Date orderDt;
	
	Date CompletedDt;	
	
	DeliveryStatus deliveryStatus;
	
	Boolean delindc;

	public OrderDtls getOrderDtls() {
		return orderDtls;
	}

	public void setOrderDtls(OrderDtls orderDtls) {
		this.orderDtls = orderDtls;
	}

	public ProductDtls getProductDtls() {
		return productDtls;
	}

	public void setProductDtls(ProductDtls productDtls) {
		this.productDtls = productDtls;
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

	public Date getOrderDt() {
		return orderDt;
	}

	public void setOrderDt(Date orderDt) {
		this.orderDt = orderDt;
	}

	public Date getCompletedDt() {
		return CompletedDt;
	}

	public void setCompletedDt(Date completedDt) {
		CompletedDt = completedDt;
	}

	public Boolean getDelindc() {
		return delindc;
	}

	public void setDelindc(Boolean delindc) {
		this.delindc = delindc;
	}
}
