import java.text.NumberFormat;
import java.util.Locale;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public String totalValueInStock(){
        double valueInStock = quantity * price;

        Locale brazilianLocale = new Locale("pt", "BR");
        NumberFormat currencyFormatter =  NumberFormat.getCurrencyInstance(brazilianLocale);
        return  currencyFormatter.format(valueInStock);
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public void showData() {
        System.out.print("Dados do produto: ");
        System.out.print(this.name);
        System.out.print(", ");

        // Formatação do preço como moeda brasileira

        Locale brazilianLocale = new Locale("pt", "BR");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(brazilianLocale);
        String formattedPrice = currencyFormatter.format(this.price);
        System.out.print(formattedPrice);

        System.out.print(", " + this.quantity + " unidades, ");


        System.out.print("Valor do produto em estoque: " + totalValueInStock());
    }
}
