package forEach;

public class Main {
	public static  void main(String[] args){
		String[] vetor = new String[] {"Matheus", "Jorge", "Luiz"};

		for(int i=0; i< vetor.length; i++){
			System.out.println(vetor[i]);
		}
		for (String nome: vetor
		     ) {
			System.out.println(nome);
		}	}

}


