package com.shop.site.model;

import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CustomerOrderMapping {
	
	int customerOrderMappingId;
	
	OrderProductMapping orderProductMapping;
	
	Customer customer;
	
	Date rowCreDt;
	
	Date rowUpdDt;
	
	Boolean DelIndc;
	
	Date CmpltdDt;
	
	

}
