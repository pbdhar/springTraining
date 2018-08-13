package com.cognizant.customer.controller

import com.cognizant.customer.model.Customer
import com.cognizant.customer.repo.CustomerRepo
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customer")

class CustomerController(val customerRepository: CustomerRepo)
{
	@PostMapping
	fun saveEmployee(@RequestBody customer: Customer): Customer
	{
		return customerRepository.save(customer)
	}

	@GetMapping("/{id}")
	
	//@CrossOrigin(origins=["http://localhost:3001","http://localhost:3000"])
	fun getEmployee(@PathVariable id: Long): Customer
	{
		return customerRepository.findById(id).orElse(null)
	}

	@GetMapping
	//@CrossOrigin(origins=["http://localhost:3001","http://localhost:3000"])
	fun getAllEmployees(): Iterable<Customer>
	{
		return customerRepository.findAll()
	}

	//@CrossOrigin(origins=["http://localhost:3001","http://localhost:3000"])
	fun updateEmployee(@RequestBody customer: Customer)
	{
		customerRepository.save(customer)
	}

	@DeleteMapping("/delete/{id}")
	//@CrossOrigin(origins=["http://localhost:3001","http://localhost:3000"])
	fun deleteEmployee(@PathVariable id: Long)
	{
		customerRepository.deleteById(id)
	}
}