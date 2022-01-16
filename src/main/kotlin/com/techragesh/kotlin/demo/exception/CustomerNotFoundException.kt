package com.techragesh.kotlin.demo.exception

import org.springframework.http.HttpStatus

class CustomerNotFoundException(val statusCode: HttpStatus, val reason: String): Exception()