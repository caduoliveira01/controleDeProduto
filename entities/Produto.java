package entities;

public class Produto {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price*quantity;
    }

    public void addProdutos(int quantity){
        this.quantity+=quantity;
    }
    public void removeProdutos(int quantity){
        this.quantity-=quantity;
    }

    public String toString(){
       return "Product data: "+name+", $"+String.format("%.2f", price)+", "+quantity+" units, Total: "+String.format("%.2f", totalValueInStock());
    }
}
