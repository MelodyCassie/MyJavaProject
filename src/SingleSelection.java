import java.util.Scanner;

public class SingleSelection {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER A NUMBER");
        int userInput = scanner.nextInt();

        if (userInput == 1) System.out.print("One");
        if (userInput == 2) System.out.print("Two");
        if (userInput == 3) System.out.print("Three");
        if (userInput == 4) System.out.print("Four");
        if (userInput == 5) System.out.print("Five");
        if (userInput == 6) System.out.print("Six");
        if (userInput == 7) System.out.print("Seven");
        if (userInput == 8) System.out.print("Eight");
        if (userInput == 9) System.out.print("Nine");
        if (userInput == 10) System.out.print("Ten");
    }
}
