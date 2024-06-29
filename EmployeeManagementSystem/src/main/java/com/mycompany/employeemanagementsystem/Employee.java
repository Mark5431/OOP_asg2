package com.mycompany.employeemanagementsystem;

/**
 *
 * @author Asus
 */
public abstract class Employee {
    // Class attributes
    private String employeeID, name; // Employee identification & employee name
    private double salary, bonus, targetSales; // Employee base salary, employee bonus & target sales
    
    // Class constructors (Overloading constructors)
    
    // Constructor 1: For Salesperson class
    public Employee(String employeeID, String name, double salary,
                    double bonus, double targetSales) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
        this.targetSales = targetSales;
    }
    
    // Constructor 2: For Manager & Developer classes
    public Employee(String employeeID, String name, double salary,
                    double bonus) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
        this.targetSales = 0; // Not necessarily needed since Java sets to 0 by default
    }
    
    // Abstract method to be implemented by subclasses
    public abstract double calculateSalary();
    
    // Getter & setter methods 
    public String getEmployeeID() {
        return this.employeeID;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    
    
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    public double getSalary() {
        return this.salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    public double getBonus() {
        return this.bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
    public double getTargetSales() {
        return this.targetSales;
    }
    public void setTargetSales(double targetSales) {
        this.targetSales = targetSales;
    }
}
