package com.expensetracker.model;

/* JPA annotations */
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationValue;
import jakarta.persistence.GenerationType;

/* Java time API for dates */

import java.time.LocalDate;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.annotation.Generated;

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