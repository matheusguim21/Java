package classes;

import java.text.NumberFormat;

public class Aluno {

    public String name;
    public double nota1;

    public double nota2;
    public double nota3;


    public double calcularmedia() {
        return (nota1 + nota2 + nota3)/3;
    }
    public boolean isApproved(){

        return calcularmedia() >= 6.0;
    }


    public void showData(){

        System.out.println("classes.Aluno: "+ this.name);
        System.out.println("Nota1: "+ this.nota1);
        System.out.println("Nota2: "+ this.nota2);
        System.out.println("Nota3: "+ this.nota3);
        System.out.println("Média: "+ calcularmedia());
        System.out.println(isApproved() ? "PASS" : "FAILED");
    }






}


