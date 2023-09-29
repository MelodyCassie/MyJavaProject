package javaChapterExercises;

import java.util.Scanner;

public class ChapterFourTwenty {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = scanner.nextLine();

    System.out.println("Enter your earnings: ");
    int earnings = scanner.nextInt();

    if(earnings <= 30000){
        double totalTax = earnings * 0.15;
    }
     else {
        double totalTax = earnings * 0.20;


        System.out.println(name + "'s total tax is: $" + totalTax);
        scanner.nextLine();
     }
   }
}
