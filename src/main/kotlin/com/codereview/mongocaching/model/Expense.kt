package com.codereview.mongocaching.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.stereotype.Component
import java.math.BigDecimal

@Schema(description = "Model for a view of a expense in categories.")
@Document("expense")
data class Expense(

    @Id
    val id: String,

    @Field(name = "name")
    @Indexed(unique = true)
    @JsonProperty("expense_name")
    var expenseName: String,

    @Field(name = "category")
    @JsonProperty("expense_category")
    var expenseCategory: ExpenseCategory,

    @Field(name = "amount")
    @JsonProperty("expense_amount")
    var expenseAmount: BigDecimal
)