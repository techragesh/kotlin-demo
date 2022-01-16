package com.techragesh.kotlin.demo.model

import javax.persistence.*

@Entity
@Table(name = "customer")
data class Customer(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int,
    @Column(name= "name")
    val name: String,
    @Column(name= "email")
    val email: String? = null,
    @Column(name= "phone_number")
    val phoneNumber: Int? = null
    )