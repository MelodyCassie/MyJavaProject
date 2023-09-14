import java.util.Scanner;

public class FactorialOfAnyNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER ANY NUMBER: ");
        int number = scanner.nextInt();

       int factorial = 1;
       int count = 1;

       while(count <= number){
           factorial = factorial * count;
           count++;
       }
       System.out.println("The factorial of" + ' ' + number + " is " + factorial);

    }
}
