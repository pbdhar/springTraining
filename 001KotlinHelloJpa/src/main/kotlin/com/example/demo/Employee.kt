package com.example.demo

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue

@Entity
data class Employee(
	@Id
	@GeneratedValue
	var  id : Long =0,
	var  name : String="",
	var  age : Long =0,
	var  dept : String=""
		
)