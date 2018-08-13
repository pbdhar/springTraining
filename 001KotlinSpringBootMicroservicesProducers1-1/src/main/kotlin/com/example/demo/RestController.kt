package com.example.demo

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
@RequestMapping("/employee")
class RestController {
	
	@RequestMapping("/welcome")
	fun welcome(): Employee1{
		
		var employee:Employee1 = Employee1(1, "Ram", 20, "CTS")
		return employee
	}
} 
