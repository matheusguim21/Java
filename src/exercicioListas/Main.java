package exercicioListas;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos funcionários serão cadastrados? ");
		int times = sc.nextInt();
		List<Employee> employees = new ArrayList<>();
		for(int i =0; i < times; i++){
			System.out.println("Digite o id do "+ (i+1)+ "° funcionário: ");
			int employeeId = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite o nome do "+ (i+1)+ "° funcionário: ");
			String employeeName = sc.nextLine();
			System.out.println("Digite o salário do "+ (i+1)+ "° funcionário:" +
					" ");
			double employeeSalary = sc.nextDouble();

			Employee employee = new Employee(employeeId, employeeName,
					employeeSalary);

			employees.add(employee);
		}

		for(Employee empregado: employees){
			System.out.println("----------------------------");
			empregado.showData();
			System.out.println("----------------------------");
		}

	}
}
