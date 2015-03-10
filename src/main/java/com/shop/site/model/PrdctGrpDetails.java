package com.shop.site.model;

import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PrdctGrpDetails {

     int PrdctGrpId;
	
	String PrdctGrpDesc;
	
	Date rowCreDt;
	
	Date rowUpdDt;
	
	Boolean DelIndc;

	public Boolean getDelIndc() {
		return DelIndc;
	}

	public void setDelIndc(Boolean delIndc) {
		DelIndc = delIndc;
	}

	public int getPrdctGrpId() {
		return PrdctGrpId;
	}

	public void setPrdctGrpId(int prdctGrpId) {
		PrdctGrpId = prdctGrpId;
	}

	public String getPrdctGrpDesc() {
		return PrdctGrpDesc;
	}

	public void setPrdctGrpDesc(String prdctGrpDesc) {
		PrdctGrpDesc = prdctGrpDesc;
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
}
