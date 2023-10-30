package arquivos.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws FileNotFoundException {
		String path = "/Users/matheusguim/Desktop/Dev/Java/Java_OO/src" +
				"/arquivos/application/teste.txt";
		File file = new File(path);
		Scanner sc = null;

		try{
			sc = new Scanner(file);
			while(sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}

		}catch (FileNotFoundException exception){
			throw  exception;
		}
		finally {
				if(sc != null) {
					sc.close();
				}

		}
	}

}
