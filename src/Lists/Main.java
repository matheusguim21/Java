package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Matheus");
		lista.add("Jorge");
		lista.add("Lourival");
		lista.add(2, "Luiz");
		System.out.println(lista);

		for(String nome: lista){
			System.out.println(nome);
		}
		System.out.println("Tamanho da Lista: "+ lista.size());
		System.out.println("--------------------------------------");
		lista.removeIf(nome -> nome.charAt(0) == 'M');
		System.out.println(lista);
		System.out.println("--------------------------------------");

		List<String> result =
				lista.stream().filter(nome -> nome.charAt(0) == 'L').toList();



		System.out.println("Nomes somente começando com L: "+ result);
		System.out.println("--------------------------------------");

		System.out.println("Primeiro nome da Lista que começa com L: "+ lista.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null));

		;


	}

}
