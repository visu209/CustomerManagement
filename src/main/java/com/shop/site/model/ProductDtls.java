package com.shop.site.model;

import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ProductDtls {
	
	int PrdctId;
	
	String PrdctDesc;
	
	PrdctGrpDetails prdctGrpDetails;
		
	Date roeCreDt;
	
	Date rowUpdDt;
	
	Boolean DelIndc;

	public int getPrdctId() {
		return PrdctId;
	}

	public void setPrdctId(int prdctId) {
		PrdctId = prdctId;
	}

	public String getPrdctDesc() {
		return PrdctDesc;
	}

	public void setPrdctDesc(String prdctDesc) {
		PrdctDesc = prdctDesc;
	}

	public PrdctGrpDetails getPrdctGrpDetails() {
		return prdctGrpDetails;
	}

	public void setPrdctGrpDetails(PrdctGrpDetails prdctGrpDetails) {
		this.prdctGrpDetails = prdctGrpDetails;
	}

	public Date getRoeCreDt() {
		return roeCreDt;
	}

	public void setRoeCreDt(Date roeCreDt) {
		this.roeCreDt = roeCreDt;
	}

	public Date getRowUpdDt() {
		return rowUpdDt;
	}

	public void setRowUpdDt(Date rowUpdDt) {
		this.rowUpdDt = rowUpdDt;
	}

	public Boolean getDelIndc() {
		return DelIndc;
	}

	public void setDelIndc(Boolean delIndc) {
		DelIndc = delIndc;
	}

}
