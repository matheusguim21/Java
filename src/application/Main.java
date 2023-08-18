package application;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import classes.Aluno;
import classes.Product;
import utils.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o nome do produto: ");
    String productName = sc.nextLine();
    System.out.println("Digite o preço do produto: ");
    double productPrice = sc.nextDouble();
//    System.out.println("Digite a quantidade do produto");
//    int productQuantity = sc.nextInt();

    Product produto = new Product(productName, productPrice);
    produto.showData();

//    classes.Funcionario funcionario = new classes.Funcionario();
//A
//    System.out.print("Digite o nome do funcionário: ");
//    funcionario.name = sc.nextLine();
//    System.out.print("Digite o salário do funcionário: ");
//    funcionario.grossSalary = sc.nextDouble();
//    System.out.print("Digite o imposto do funcionário: ");
//    funcionario.tax = sc.nextDouble();
//
//    funcionario.showData();
//
//
//    System.out.println("Deseja aumentar o salário do funcionário em quantos % ? ");
//
//    funcionario.increaseSalary(sc.nextDouble());

//        Aluno aluno = new Aluno();
//
//        System.out.println("Digite o nome do classes.Aluno");
//        aluno.name = sc.nextLine();
//        System.out.println("Digite a nota do primeiro semestre: ");
//        aluno.nota1 = sc.nextDouble();
//        System.out.println("Digite a nota do segundo semestre: ");
//        aluno.nota2 = sc.nextDouble();
//        System.out.println("Digite a nota do terceiro semestre: ");
//        aluno.nota3 = sc.nextDouble();
//
//        aluno.showData();




    }
}

