package exercicioListas;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Stream;

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


			employees.add(new Employee(employeeId, employeeName,
					employeeSalary));
		}

			System.out.println("----------------------------");
		for(Employee empregado: employees){
			empregado.showData();
			System.out.println("----------------------------");
		}
		System.out.println("Digite o ID do funcionário que  você deseja " +
				"aumentar" +
				" o " +
				"salário? ");

		int employeeId = sc.nextInt();
		Employee agraciado =
				employees.stream().filter(func -> func.getId() == employeeId).findFirst().orElse(null);
		if(agraciado == null){
			System.out.println("Não existe funcionário com esse ID");
		}
		else{
			System.out.println("Qual a porcentagem que você quer aumentar do " +
					"salário? \n Salário: " + NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(agraciado.getSalary()));
			agraciado.increaseSalary(sc.nextDouble());
		System.out.println("Dados do funcionário atualizados: ");
		agraciado.showData();
		}


	}
}
