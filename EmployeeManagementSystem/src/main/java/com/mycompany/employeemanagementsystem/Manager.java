package com.mycompany.employeemanagementsystem;

/**
 *
 * @author Asus
 */
public class Manager extends Employee {
    public Manager(String employeeID, String name, double salary,
                   double bonus) {
        super(employeeID, name, salary, bonus);
    }
    
    // Salaries of managers typically do not include target sales
    @Override
    public double calculateSalary() {
        return this.getSalary() + this.getBonus();
    }
}
