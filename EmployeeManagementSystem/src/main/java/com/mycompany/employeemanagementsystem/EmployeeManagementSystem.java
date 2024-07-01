package com.mycompany.employeemanagementsystem;

/**
 *
 * @author Asus
 */
public class EmployeeManagementSystem {

    public static void main(String[] args) {
        // Instantiate one manager
        Manager manager1 = new Manager("01234", "Alex", 12400, 600);
        // Instantiate two developers
        Developer dev1 = new Developer("12345", "Bob", 8000, 450);
        Developer dev2 = new Developer("23456", "Cindy", 7000, 400);

        // Instantiate three salesperson
        Salesperson salesperson1 = new Salesperson("34567", "Dickson", 4600, 300, 2500, 0.20);
        Salesperson salesperson2 = new Salesperson("45678", "Edward", 4200, 300, 2800, 0.30);
        Salesperson salesperson3 = new Salesperson("56789", "Faouzia", 4000, 300, 3000, 0.24);
        
        // An array to keep all 6 employees:
        Employee[] employees = {manager1, dev1, dev2, salesperson1, salesperson2, salesperson3};
        
        // Print out employee details using toString() method implicitly & calculate total salary:
        double totalSalary = 0;
        for (Employee employee : employees) {
            System.out.println(employee);
            totalSalary += employee.calculateSalary();
        }
        System.out.printf("Total salary of all employees: RM%.2f",totalSalary);
        
    }
}
