package com.mycompany.employeemanagementsystem;

/**
 *
 * @author Asus
 */

public class Developer extends Employee {
    public Developer(String employeeID, String name, double salary,
                   double bonus) {
        super(employeeID, name, salary, bonus);
    }
    
    // Salaries of developers typically do not include target sales
    @Override
    public double calculateSalary() {
        return this.getSalary() + this.getBonus();
    }
    
    // Override default toString() method for text formatting
    @Override
    public String toString() {
        return "Employee ID: " + this.getEmployeeID() + "\n" +
                "Name: " + this.getName() + "\n" + 
                "Job: Developer \n" +
                "Base Salary: RM" + String.format("%.2f", this.getSalary()) + "\n" + 
                "Bonus: RM" + String.format("%.2f", this.getBonus()) + "\n";
    }
}