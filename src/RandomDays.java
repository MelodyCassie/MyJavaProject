import java.awt.*;
import java.util.Scanner;

public class RandomDays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer for today's day of the week: ");
        int date = scanner.nextInt();

        System.out.println("Enter future day of the week: ");
        int day = scanner.nextInt();


       switch (date){
           case 0:
               System.out.println("Sunday");
       }
       switch (date) {
           case 1:
               System.out.println("Monday");
       }
       switch (date) {
           case 2:
               System.out.println("Tuesday");
       }
       switch (date) {
           case 3:
               System.out.println("Wednesday");
       }
       switch (date) {
           case 4:
               System.out.println("Thursday");
       }
       switch (date) {
           case 5:
               System.out.println("Friday");
       }
       switch (date) {
           case 6:
               System.out.println("Saturday");
       }


       switch (day) {
           case 0:
               System.out.println("Future Day is SUNDAY");
       }
       switch (day) {
           case 1:
               System.out.println("Future Day is MONDAY");
       }
       switch (day) {
           case 2:
               System.out.println("Future Day is TUESDAY");
       }
       switch (day) {
           case 3:
               System.out.println("Future Day is WEDNESDAY");
       }
       switch (day) {
           case 4:
               System.out.println("Future Day is THURSDAY");
       }
       switch (day) {
           case 5:
               System.out.println("Future Day is FRIDAY");
       }
       switch (day) {
           case 6:
               System.out.println("Future Day is SATURDAY");
       }

        int predict = date + day % 7;


    }
}
