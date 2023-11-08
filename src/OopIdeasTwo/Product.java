package OopIdeasTwo;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Product[] products = new Product[3];

        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 3; i ++){
            
            Product newProduct  = new Product();
            
            System.out.println("What did the customer buy? ");
            newProduct.setName (scanner.nextLine());

            System.out.println("How much for each");
            newProduct.setPrice (Double.parseDouble(scanner.nextLine()));

            System.out.println("Quantity? ");
            newProduct.setQuantity(Integer.parseInt(scanner.nextLine()));
        }
    }

    


    private String name;
    private Double price;
    private  int quantity;

    public String getName(){
        return name;
    }
    public  void setName(String name){
        this.name = name;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    private void setQuantity(int i) {
    }

}
