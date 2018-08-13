package com.example.demo

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins=["http://localhost:3000"])
class RestController(val employeeRepository: EmployeeRepository)
{
	@PostMapping
	fun saveEmployee(@RequestBody employee: Employee): Employee
	{
		return employeeRepository.save(employee)
	}

	@GetMapping("/{id}")
	
	//@CrossOrigin(origins=["http://localhost:3001","http://localhost:3000"])
	fun getEmployee(@PathVariable id: Long): Employee
	{
		return employeeRepository.findById(id).orElse(null)
	}

	@GetMapping
	//@CrossOrigin(origins=["http://localhost:3001","http://localhost:3000"])
	fun getAllEmployees(): Iterable<Employee>
	{
		return employeeRepository.findAll()
	}

	//@CrossOrigin(origins=["http://localhost:3001","http://localhost:3000"])
	fun updateEmployee(@RequestBody employee: Employee)
	{
		employeeRepository.save(employee)
	}

	@DeleteMapping("/{id}")
	//@CrossOrigin(origins=["http://localhost:3001","http://localhost:3000"])
	fun deleteEmployee(@PathVariable id: Long)
	{
		employeeRepository.deleteById(id)
	}
}