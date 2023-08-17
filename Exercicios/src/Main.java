// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Funcionario funcionario = new Funcionario();

    System.out.print("Digite o nome do funcionário: ");
    funcionario.name = sc.nextLine();
    System.out.print("Digite o salário do funcionário: ");
    funcionario.grossSalary = sc.nextDouble();
    System.out.print("Digite o imposto do funcionário: ");
    funcionario.tax = sc.nextDouble();

    funcionario.showData();


    System.out.println("Deseja aumentar o salário do funcionário em quantos % ? ");

    funcionario.increaseSalary(sc.nextDouble());


    }
}

