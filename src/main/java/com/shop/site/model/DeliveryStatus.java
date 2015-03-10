package com.shop.site.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DeliveryStatus {

	public int delvryStatusId;
	
	Boolean doorDlvry;
		
	public String deliveryStatusDesc;

	public int getDelvryStatusId() {
		return delvryStatusId;
	}

	public void setDelvryStatusId(int delvryStatusId) {
		this.delvryStatusId = delvryStatusId;
	}

	public String getDeliveryStatusDesc() {
		return deliveryStatusDesc;
	}

	public void setDeliveryStatusDesc(String deliveryStatusDesc) {
		this.deliveryStatusDesc = deliveryStatusDesc;
	}

	public Boolean getDoorDlvry() {
		return doorDlvry;
	}

	public void setDoorDlvry(Boolean doorDlvry) {
		this.doorDlvry = doorDlvry;
	}


}
