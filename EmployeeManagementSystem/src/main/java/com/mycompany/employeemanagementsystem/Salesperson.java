package com.mycompany.employeemanagementsystem;

/**
 *
 * @author Asus
 */

public class Salesperson extends Employee {
    public Salesperson(String employeeID, String name, double salary,
                   double bonus, double targetSales) {
        super(employeeID, name, salary, bonus, targetSales);
    }
    
    // Only a salesperson's salary would be affected by target sales typically 
    @Override
    public double calculateSalary() {
            // Commission = 5% of target sales
            double commission = this.getTargetSales() * 0.05;
            // Final salary = Base salary + Bonus + Commission
            return this.getSalary() + this.getBonus() + commission;
    }
}