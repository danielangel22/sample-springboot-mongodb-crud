package com.codereview.mongocaching

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
//@EnableAutoConfiguration(exclude = [MongoAutoConfiguration::class])
class ExpenseTrackerApplication

fun main(vararg args: String) {
    runApplication<ExpenseTrackerApplication>(*args)
}
