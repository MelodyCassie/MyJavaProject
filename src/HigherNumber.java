import java.util.Scanner;

public class HigherNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter  Number1: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter  Number2: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter  Number3: ");
        int number3 = scanner.nextInt();


        if(number1 >= number2 && number1 >= number3){
            System.out.println("Number1 Is Larger");
        }
        if (number2 >= number1  &&  number2 >= number3){
            System.out.println("Number2 Is Larger");
        }
        if (number3 >= number1 && number3 >= number2){
            System.out.println("Number3 Is Larger");
        }
    }
}
