package randomPractices;

import java.util.Scanner;

public class ArraysPracticeTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        for( int i = 0; i < numbers.length; i++) {
            System.out.println(" Enter number " + (i + 1));
            numbers[i] = scanner.nextInt();

        }

        int sum = 0;
        for(int number : numbers){
            System.out.println(number);
            sum+= number;
        }
        System.out.println("SUm of the numbers is "+ sum);

    }
}
