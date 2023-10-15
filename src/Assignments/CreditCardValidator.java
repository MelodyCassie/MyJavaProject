package Assignments;

import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cardNumber = "";


        System.out.print("Hello, kindly enter your card details to verify: ");
         cardNumber = scanner.nextLine();


        if(cardNumber.length() == 13 || cardNumber.length() == 16) {
           System.out.println("Card Number Added Successfully!");
        }
          else{
                System.out.println("Invalid Card");
          }

         int firstNumber =  Character.getNumericValue(cardNumber.charAt(0));
         if(firstNumber == 4){
             System.out.println("Visa Card");
         }
         else if (firstNumber == 5) {
             System.out.println("Master Card");
         }
          else if (firstNumber == 6) {
             System.out.println("Discover Card");
         }
          int firstTwoNumbers = Integer.parseInt(cardNumber.substring(0,2));
          if(firstTwoNumbers == 37){
              System.out.println("American Express Card");
          }
          System.out.println(cardNumber);

          System.out.println(cardNumber.length());

          for(int count = cardNumber.length()-2; count >= 0; count-=2){

             //int secondToLastNumber = Character.getNumericValue(cardNumber.charAt(-2));
             //secondToLastNumber = secondToLastNumber * 2;
          }
    }
}

