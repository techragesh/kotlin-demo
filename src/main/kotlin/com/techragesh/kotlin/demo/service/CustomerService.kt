package com.techragesh.kotlin.demo.service

import com.techragesh.kotlin.demo.model.Customer

interface CustomerService {

    fun save(customer: Customer) : Customer

    fun getCustomerById(id: Int) : Customer?

    fun findAllCustomer(): List<Customer>

    fun updateCustomerById(id: Int, customer: Customer): Customer

    fun deleteById(id: Int)
}