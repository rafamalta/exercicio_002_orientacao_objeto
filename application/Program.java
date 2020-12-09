package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee salary = new Employee();
		
		System.out.print("Name: ");
		salary.name = sc.nextLine();
		System.out.print("Gross salary: ");
		salary.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		salary.tax = sc.nextDouble();
		
		System.out.print("Employee: " + salary);
		System.out.println();
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double percentege = sc.nextDouble();
		salary.increaseSalary(percentege);		
		
		System.out.println();
		System.out.print("Updated data: " + salary);

		sc.close();

	}

}
