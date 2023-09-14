import java.util.Scanner;

public class LargestSmallestNumberLoop {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int input = scanner.nextInt();



        int largest = 0;
        int smallest = 0;

        while (input != 0) {
            System.out.println("Enter a number or press 0 to quit");
            input = scanner.nextInt();

        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}


