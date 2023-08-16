// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Product produto = new Product();

       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite o nome do produto: ");
       produto.name = sc.nextLine();
       System.out.println("Digite o preço do produto: ");
       produto.price = sc.nextDouble();
       System.out.println("Digite a quantidade do produto");
        produto.quantity = sc.nextInt();

        System.out.println("Valor do produto em estoque: "+produto.totalValueInStock());

        produto.addProducts(4);
        System.out.print("Valor em estoque após adição de quantidade: ");
        System.out.println(produto.totalValueInStock());
        produto.removeProducts(2);
        System.out.println(produto.totalValueInStock());

        produto.showData();
    }
}

