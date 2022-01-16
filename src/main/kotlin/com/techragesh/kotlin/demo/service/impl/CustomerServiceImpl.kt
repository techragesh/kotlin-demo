package com.techragesh.kotlin.demo.service.impl

import com.techragesh.kotlin.demo.exception.CustomerNotFoundException
import com.techragesh.kotlin.demo.model.Customer
import com.techragesh.kotlin.demo.repository.CustomerRepository
import com.techragesh.kotlin.demo.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service

@Service
class CustomerServiceImpl (private val customerRepository: CustomerRepository ) : CustomerService {


    override fun save(customer: Customer): Customer = customerRepository.save(customer)

    override fun getCustomerById(id: Int): Customer? = customerRepository.getById(id)

    override fun findAllCustomer(): List<Customer> = customerRepository.findAll()

    override fun updateCustomerById(id: Int, customer: Customer): Customer {
       return if(customerRepository.existsById(id)) {
           customerRepository.save(Customer(
               id = id,
               name = customer.name,
               email = customer.email,
               phoneNumber = customer.phoneNumber
           ))
       } else throw CustomerNotFoundException(HttpStatus.NOT_FOUND, "Customer was not found")
    }

    override fun deleteById(id: Int) = customerRepository.deleteById(id)


}