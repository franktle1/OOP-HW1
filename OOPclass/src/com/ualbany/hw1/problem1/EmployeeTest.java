package com.ualbany.hw1.problem1;

public class EmployeeTest {

	public static void main(String[] args) {
		//Instantiates 2 Employee object 
		Employee employee1 = new Employee("Bob", "Smith", 111);
		Employee employee2 = new Employee("Mark","Zuckerburg", 3000.00);
		
		//Prints out initial statistics of the two employees
		showStats(employee1);
		showStats(employee2);
		
		//Increases employee objects by 10 percent
		giveRaise(employee1);
		giveRaise(employee2);
		
		
		showStats(employee1);
		showStats(employee2);
	}
	
	//multiplies Employee object by 10%
	public static void giveRaise(Employee emp) {
		double new_salary; 
		new_salary = emp.getSalary() + emp.getSalary()*.1;
		emp.setSalary(new_salary);
		
	}
	
	//displays Employee variables
	public static void showStats(Employee emp) {
		System.out.println("Employee Name: " + emp.getFirstName()
		+ " " + emp.getLastName() +"\nMonthly Salary: " + emp.getSalary());		
	}
	
}
