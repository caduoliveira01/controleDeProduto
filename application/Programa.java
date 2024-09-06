package application;
import java.util.Scanner;
import entities.Produto;
public class Programa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Enter products data:");
        System.out.println("Name:");
        produto.name=sc.nextLine();
        System.out.println("Price:");
        produto.price=sc.nextDouble();
        System.out.println("Quantity:");
        produto.quantity=sc.nextInt();

        System.out.println(produto);

        sc.close();
    }
}