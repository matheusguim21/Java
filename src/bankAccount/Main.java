package bankAccount;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {



	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Para criar uma conta digite o seu nome");
		String holderName = sc.nextLine();

		int accountNumber = random.nextInt(0, 999999);
		String formattedAccountNumber = String.format("%06d", accountNumber);
		Account contaBancaria = new Account(formattedAccountNumber, holderName);

		contaBancaria.showData();

		System.out.println("Deseja fazer um depósito inicial?");











	}
}
