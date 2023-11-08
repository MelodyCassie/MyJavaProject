package OopIdeasTwo;

import java.util.Scanner;

public class ProductTwo {
    public static void main(String[] args) {
        String[][]  products = new String[3][3];

        Scanner scanner = new Scanner(System.in);


        for(int i = 0; i < 3; i++){
            System.out.println("What did the customer buy");
            products[i][0] = (scanner.nextLine());

            System.out.println("How m");
            products[i][1] = (scanner.nextLine());
        }
    }
}
