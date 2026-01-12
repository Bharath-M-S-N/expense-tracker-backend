package com.expensetracker.model;

/* JPA annotations */
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Expense{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Double amount;

    private String category;

    private String description;

    private LocalDate expenseDate;

    // Required by JPA
    public Expense(){

    }

    public Expense(Double amount, String category, String description, LocalDate expenseDate){
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.expenseDate = expenseDate;
    }

    public Long getId(){
        return id;
    }

    public Double getAmount(){
        return amount;
    }

    public String getCategory(){
        return category;
    }

    public String getDescription(){
        return description;
    }

    public LocalDate getExpenseDate(){
        return expenseDate;
    }

    public void setAmount(Double amount){
        this.amount = amount;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setDescription(String descripotion){
        this.description = descripotion;
    }

    public void setExpenseDate(LocalDate expenseDate){
        this.expenseDate = expenseDate;
    }
}