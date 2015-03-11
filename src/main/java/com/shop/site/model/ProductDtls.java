package com.shop.site.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ProductDtls {

    @Id
    private String id;

    private int PrdctId;

    private String PrdctDesc;

    private PrdctGrpDetails prdctGrpDetails;

    private Date rowCreDt;

    private Date rowUpdDt;

    private Boolean delIndc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
        return rowCreDt;
    }

    public void setRoeCreDt(Date roeCreDt) {
        this.rowCreDt = roeCreDt;
    }

    public Date getRowUpdDt() {
        return rowUpdDt;
    }

    public void setRowUpdDt(Date rowUpdDt) {
        this.rowUpdDt = rowUpdDt;
    }

    public Boolean getDelIndc() {
        return delIndc;
    }

    public void setDelIndc(Boolean delIndc) {
        this.delIndc = delIndc;
    }

}
