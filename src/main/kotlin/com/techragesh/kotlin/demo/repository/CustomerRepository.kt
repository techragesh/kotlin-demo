package com.techragesh.kotlin.demo.repository

import com.techragesh.kotlin.demo.model.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : JpaRepository<Customer, Int>{
}