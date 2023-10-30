package arquivos.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndBufferedWriter {
	public static void main(String[] args) {
		String [] lines = new String []{"Olá Mundo", "Bom dia", "Boa Noite"};
		String path = "/Users/matheusguim/Desktop/Dev/Java/Java_OO/src" +
				"/arquivos/application/testeFileWriter.txt";

		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,
				true))){
			for( String line: lines){
				bw.write(line);
				bw.newLine();
			}
		}catch (IOException e){
			System.out.println(e.getCause());
		}

;
	}
}
