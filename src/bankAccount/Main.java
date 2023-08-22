package bankAccount;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {



	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Account account;

		System.out.println("Para criar uma conta digite o seu nome");
		String holderName = sc.nextLine();

		int accountNumber = random.nextInt(0, 999999);
		String formatedAccountNumber = String.format("%06d", accountNumber);
		System.out.println("Deseja fazer um depósito incicial?");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.println("Digite o valor do depósito: ");
			account = new Account(holderName, formatedAccountNumber, sc.nextDouble());
			account.showData();
		}
		else {
			account= new Account(holderName, formatedAccountNumber);
			account.showData();
		}
		}

	}
