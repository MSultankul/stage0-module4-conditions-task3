package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10000 && salary >= 0) {
            double taxedSalary = salary * 0.85; // 15% tax
            System.out.println("Net Salary after taxes: " + taxedSalary);
        } else if (salary > 10000 && salary <= 20000) {
            double taxedSalary = salary * 0.82; // 18% tax
            System.out.println("Net Salary after taxes: " + taxedSalary);
        } else if (salary > 20000) {
            double taxedSalary = salary * 0.8; // 20% tax
            System.out.println("Net Salary after taxes: " + taxedSalary);
        } else {
            System.out.println("wrong input!");
        }
    }
}