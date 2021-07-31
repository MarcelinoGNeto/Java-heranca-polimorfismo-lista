package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.Terceirizados;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of Employees: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Employee #" + i + " data:\n");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per Hour: ");
			double valuePerHour = sc.nextDouble();

			if (ch == 'n') {
				list.add(new Employee(name, hours, valuePerHour));
			}
			else {
				System.out.print("Additional charge: ");
				double additional = sc.nextDouble();
				list.add(new Terceirizados(name, hours, valuePerHour, additional));
			}
		}

		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee emp : list) {
			System.out.println(emp);
		}

		sc.close();
	}
}