package com.cognizant.customer.repo


import com.cognizant.customer.model.Customer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepo : CrudRepository<Customer,Long>
{
}