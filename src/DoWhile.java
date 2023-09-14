import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter Second Number: ");
        int secondNumber = scanner.nextInt();

        int result = firstNumber + secondNumber;
        System.out.println("The sum of the numbers you entered are: " + ' ' + result);

        while(result >= 0);
//            System.out.println("Do you wish to perform the action again?" ,+ "If Yes Type 1" + "If No Type 2" ,);
        }
    }
//}
