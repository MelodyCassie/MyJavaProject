import java.util.Scanner;

public class HighestLowest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter firstNumber");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter secondNumber");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter thirdNumber");
        int thirdNumber = scanner.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber){
            System.out.println("First Number is Larger");
        }
        else
        if (secondNumber >= firstNumber && secondNumber >= thirdNumber){
            System.out.println("Second Number is Larger");
        }
        else {
            System.out.println("Third Number is Larger");
        }


        if (firstNumber <= secondNumber && firstNumber <= thirdNumber){
            System.out.println("First Number is Smaller");
        }
        else
        if (secondNumber <= firstNumber && secondNumber <= thirdNumber){
            System.out.println("Second Number is Smaller");
        }
        else {
            System.out.println("Third Number is Smaller");
        }

    }
}
