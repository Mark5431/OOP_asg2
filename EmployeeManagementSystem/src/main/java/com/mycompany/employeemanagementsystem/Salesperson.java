package com.mycompany.employeemanagementsystem;
/**
 *
 * @author Asus
 */
public class Salesperson extends Employee {
    // Additional class attribute for Salesperson, commission rate
    private double commissionRate; // in decimal form (not %)
    
    public Salesperson(String employeeID, String name, double salary,
                   double bonus, double targetSales, double commissionRate) {
        super(employeeID, name, salary, bonus, targetSales);
        this.commissionRate = commissionRate;
    }
    // Only a salesperson's salary would be affected by target sales typically 
    @Override
    public double calculateSalary() {
            // Commission = 5% of target sales
            double commission = this.getTargetSales() * this.commissionRate; // Commission Rate accessible directly
            // Final salary = Base salary + Bonus + Commission
            return this.getSalary() + this.getBonus() + commission;
    }
    
    // Get & set methods for commissionRate
    public double getCommisssionRate() {
        return this.commissionRate;
    }
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    
    // Override default toString() method for text formatting
    @Override
    public String toString() {
        return "Employee ID: " + this.getEmployeeID() + "\n" +
                "Name: " + this.getName() + "\n" + 
                "Job: Developer \n" +
                "Base Salary: RM" + String.format("%.2f", this.getSalary()) + "\n" + 
                "Bonus: RM" + String.format("%.2f", this.getBonus()) + "\n" +
                "Target Sales: RM" + String.format("%.2f", this.getTargetSales()) + "\n" +
                "Commission Rate: " + (int)(this.commissionRate*100) + "%\n" +
                "Commission: RM" + String.format("%.2f", this.getTargetSales()*this.commissionRate) + "\n" +
                "Final Salary: RM" + String.format("%.2f", this.calculateSalary()) + "\n";
    }
}