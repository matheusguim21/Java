package exercicioListas;

import java.text.NumberFormat;
import java.util.Locale;

public class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void showData(){
		System.out.println("Funcionário: "+ id);
		System.out.println("Id: "+ id);
		System.out.println("Nome: "+ name);
		System.out.println("Salário: "+ NumberFormat.getCurrencyInstance(new Locale("pt", "BR")));
	}
}
