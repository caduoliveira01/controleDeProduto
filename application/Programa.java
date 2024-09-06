package application;
import java.util.Scanner;
import entities.Produto;
import java.util.Locale;

public class Programa{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Enter products data:");
        System.out.print("Name:");
        produto.name=sc.nextLine();
        System.out.print("Price:");
        produto.price=sc.nextDouble();
        System.out.print("Quantity:");
        produto.quantity=sc.nextInt();

        System.out.println("Product data: "+produto);

        System.out.println("");
        System.out.println("Enter the quantity of products to be add in stock:");
        int quantity= sc.nextInt();
        produto.addProdutos(quantity);

        System.out.println("Updated data: "+produto);

        System.out.println("");
        System.out.println("Enter the quantity of products to be remove from stock:");
        quantity= sc.nextInt();
        produto.removeProdutos(quantity);

        System.out.println("Updated data: "+produto);

        sc.close();
    }
}