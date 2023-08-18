package bankAccount;

public class Account {
	private String number;
	private String holder;
	private double balance;
	public Account(String number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);

	}

	public String getNumber() {
		return number;
	}



	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}



	public  void deposit(double amount){
		balance += amount;
	}
	public void withdraw(double value){
		if(value > getBalance()){
			System.out.println("Valor de saldo indisponível para saque");
		}else {
			balance -= value;
		}
	}
	public void showData(){
		System.out.println("Dados da conta: ");
		System.out.println("Proprietáio: "+ holder);
		System.out.println("Número da conta: "+ number);
		System.out.println("Saldo da conta: "+ balance);

	}
}
