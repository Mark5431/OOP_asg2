package com.mycompany.employeemanagementsystem;

/**
 *
 * @author Asus
 */
public class EmployeeManagementSystem {

    public static void main(String[] args) {
        // Instantiate two managers
        Manager manager1 = new Manager("01234", "Alex", 12400, 600);
        Manager manager2 = new Manager("12345", "Bob", 13000, 600);
        // Instantiate three developers
        Developer dev1 = new Developer("23456", "Cindy", 7000, 400);
        Developer dev2 = new Developer("34567", "Dickson", 8600, 400);
        Developer dev3 = new Developer("45678", "Edward", 6700, 400);
        // Instantiate a salesperson
        Salesperson salesperson1 = new Salesperson("56789", "Faouzia", 4000, 300, 3000);
        
        // An array to keep all 6 employees:
        Employee[] employees = {manager1, manager2, dev1, dev2, dev3, salesperson1};
        
        // Calculate total salary:
        double total_salary = 0;
        for (Employee employee : employees) {
            total_salary += employee.calculateSalary();
        }
        System.out.printf("The total salary of all the employees is RM%.2f.",total_salary);
    }
}
