package javaProject1;
import java.util.Scanner;
public class Employee implements java.io.Serializable {

	// Private fields for employee details
	private int empId;
	private String empName;
	private int empAge;
	private double empSalary;

	// Constructor with no arguments
	public Employee() {
	}

	// Constructor with arguments
	public Employee(int empId, String empName, int empAge, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

	// Getters and setters for employee details
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public static void main(String[] args) {
		// Create Employee object
		Employee obj = new Employee();

		// Set employee ID
		int id1 = 101;
		obj.setEmpId(id1);

		// Set employee name
		obj.setEmpName("Nikita Karape");

		// Set employee age
		obj.setEmpAge(23);

		// Set employee salary
		obj.setEmpSalary(70000.0);

		// Display employee details
		System.out.println("Employee ID: " + obj.getEmpId());
		System.out.println("Employee Name: " + obj.getEmpName());
		System.out.println("Employee Age: " + obj.getEmpAge());
		System.out.println("Employee Salary: " + obj.getEmpSalary());
	}
}         
/* Output
Employee ID: 101
Employee Name: Nikita Karape
Employee Age: 23
Employee Salary: 70000.0
 */