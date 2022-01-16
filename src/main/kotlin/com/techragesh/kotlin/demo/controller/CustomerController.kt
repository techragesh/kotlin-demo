package com.techragesh.kotlin.demo.controller

import com.techragesh.kotlin.demo.model.Customer
import com.techragesh.kotlin.demo.service.CustomerService
import org.springframework.web.bind.annotation.*

@RestController
class CustomerController(private val customerService: CustomerService) {

    @GetMapping("/")
    fun getCustomers(): List<Customer> = customerService.findAllCustomer();

    @PostMapping("/customer")
    fun saveCustomer(@RequestBody customer: Customer): Customer = customerService.save(customer)

    @GetMapping("/customer/{id}")
    fun getCustomerById(@PathVariable id: Int): Customer? = customerService.getCustomerById(id)

    @PutMapping("/customer/{id}")
    fun updateCustomer(@PathVariable id: Int, @RequestBody customer: Customer): Customer = customerService.updateCustomerById(id, customer)

    @DeleteMapping("/customer/{id}")
    fun deleteById(@PathVariable id: Int) = customerService.deleteById(id)

}