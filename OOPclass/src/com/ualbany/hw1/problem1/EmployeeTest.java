package com.ualbany.hw1.problem1;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Bob", "Smith", 100);
		Employee employee2 = new Employee("Mark","Zuckerburg", 3000.00);
		showStats(employee1);
		showStats(employee2);
		giveRaise(employee1);
		giveRaise(employee2);
		showStats(employee1);
		showStats(employee2);
	}
	
	public static void giveRaise(Employee emp) {
		double new_salary; 
		new_salary = emp.getSalary() + emp.getSalary()*.1;
		emp.setSalary(new_salary);
		
	}
	
	public static void showStats(Employee emp) {
		System.out.println("Employee Name: " + emp.getFirstName()
		+ " " + emp.getLastName() +"\nMonthly Salary: " + emp.getSalary());		
	}
	
}
