package classes;

import java.text.NumberFormat;
import java.util.Locale;
public class Funcionario {
    public String name;
    public double grossSalary;
    public double tax;


    NumberFormat moedaBrazileira = NumberFormat.getCurrencyInstance(new Locale("pt","BR"));
    public String netSalary(){

        return  moedaBrazileira.format(grossSalary - tax);
    }

    public void increaseSalary(double percentage){



        this.grossSalary += this.grossSalary * (percentage/100);
        System.out.println("Salário bruto atualizado: "+ moedaBrazileira.format(grossSalary));
        System.out.println("Salário líquido atualizado: " +this.netSalary());
    }
    public void showData(){
        System.out.println("Funcionário: "+ this.name + ", " + this.netSalary());
    }


}
