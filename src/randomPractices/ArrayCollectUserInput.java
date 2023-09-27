package randomPractices;

import java.util.Scanner;

public class ArrayCollectUserInput {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] numbers = new int[10];
    for(int count = 0; count < numbers.length; count++){
        System.out.println("Enter number: " + (count + 1));
        numbers[count] = scanner.nextInt();
    }
    for(int count : numbers){
        System.out.print(count+" ");
    }



    }
}
