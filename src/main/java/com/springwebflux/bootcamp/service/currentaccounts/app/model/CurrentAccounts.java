package com.springwebflux.bootcamp.service.currentaccounts.app.model;
 
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="current-accounts")
public class CurrentAccounts {

@Id
	private String id;
	private String dni;
	private String name;
	private List<String> headline = new ArrayList<String>();
	private String date;		 
	private String description; 
	private Double cash;
	
	
/*	  withdrawals; //retiros
  deposits;	//depositos */
		 
	
	
}
