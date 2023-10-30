package hashCodeEquals.application;

import hashCodeEquals.entities.Client;

public class Program {

	public static void main(String[] args) {
		Client c1 = new Client("Matheus", "matheusguim13@gmail.com");
		Client c2 = new Client("Sarah", "sarahbeatriz160@gmail.com");

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c2.equals(c1));


	}
}
