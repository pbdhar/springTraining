package com.cognizant.customer.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue


@Entity
class Customer
	(
	@Id
	@GeneratedValue	
	var  id : Long =0,
	var  name : String="",
	var  age : Long =0,
	var  address1 : String="",
	var adrress2: String=""		
)