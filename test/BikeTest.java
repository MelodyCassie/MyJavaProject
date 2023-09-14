import tdd.Bike;

import java.util.Scanner;

public class BikeTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Bike toyota = new Bike();

        System.out.print("Enter Name: ");
        toyota.setName("Toyota");
        String name = toyota.getName();
        System.out.print(name);

        System.out.print("Turn it on: ");
        boolean is0n = toyota.getIsOn();
        System.out.print("it is On");


        boolean balance = false;
        System.out.println(balance);

    }



}


