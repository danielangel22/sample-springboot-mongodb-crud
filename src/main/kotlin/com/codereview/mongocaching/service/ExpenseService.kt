package com.codereview.mongocaching.service

import com.codereview.mongocaching.model.Expense
import com.codereview.mongocaching.repository.ExpenseRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ExpenseService(@Autowired val expenseRepository: ExpenseRepository) {

    fun addExpense(expense: Expense): Expense = expenseRepository.insert(expense)

    fun updateExpense(expense: Expense) {
        val savedExpense: Expense = expenseRepository
            .findById(expense.id)
            .orElseThrow { throw RuntimeException("Cannot find Expense by ID") }
        savedExpense.expenseName = expense.expenseName
        savedExpense.expenseCategory = expense.expenseCategory
        savedExpense.expenseAmount = expense.expenseAmount
        expenseRepository.save(savedExpense)
    }

    fun getAllExpense(): List<Expense> = expenseRepository.findAll()

    fun getExpenseByName(name: String): Expense =
        expenseRepository.findByName(name).orElseThrow { throw RuntimeException("Cannot find Expense by Name") }

    fun deleteExpense(id: String) = expenseRepository.deleteById(id)
}